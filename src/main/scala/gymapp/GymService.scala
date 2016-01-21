package gymapp

import spray.routing.HttpService

trait GymService extends HttpService {
  val helloRoute = path("") {
    get {
      complete {
        <html>
          <head>
            <title>Gym App</title>
          </head>

          <body>
            <h1>The beginning!</h1>
          </body>
        </html>
      }
    }
  }

}
