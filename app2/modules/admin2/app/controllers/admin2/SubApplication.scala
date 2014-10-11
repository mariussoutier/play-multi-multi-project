package controllers.admin2 // package must be exactly this

import play.api.mvc._

object SubApplication extends Controller {

  def index() = Action { request =>
    Ok(views.html.admin2.index())
  }

}
