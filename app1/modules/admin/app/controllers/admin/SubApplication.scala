package controllers.admin // package must be exactly this

import javax.inject._

import akka.actor.ActorRef
import akka.util.Timeout
import play.api.mvc._

import scala.concurrent.ExecutionContext

@Singleton
class SubApplication @Inject() (@Named("dummy-actor") actor: ActorRef)(implicit ec: ExecutionContext)
  extends Controller {

  def index() = Action.async { request =>
    import akka.pattern.ask
    import scala.concurrent.duration._
    implicit val timeout = Timeout(5.seconds)
    (actor ? 'ping).mapTo[Symbol].map { response =>
      Ok(views.html.admin.index(response.toString))
    }

  }

}
