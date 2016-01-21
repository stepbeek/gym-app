package gymapp

import akka.actor.{Actor, ActorRefFactory}

class GymServiceActor extends Actor with GymService {
  override def receive: Receive = runRoute(helloRoute)

  override def actorRefFactory: ActorRefFactory = context
}
