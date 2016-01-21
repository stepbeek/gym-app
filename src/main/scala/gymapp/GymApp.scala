package gymapp

import akka.actor.{ActorRef, ActorSystem, Props}
import akka.io.IO
import akka.util.Timeout
import spray.can.Http

import scala.concurrent.duration._


object GymApp extends App {

  import akka.pattern.ask

  implicit val actorSystem = ActorSystem("gym-app")

  val listener: ActorRef = actorSystem.actorOf(Props[GymServiceActor])

  implicit val timeout: Timeout = 5 seconds

  IO(Http) ? Http.Bind(listener, "::", 8000)
}