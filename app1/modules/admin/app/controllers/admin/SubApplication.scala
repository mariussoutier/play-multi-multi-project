package controllers.admin // package must be exactly this

import play.api.mvc._

object SubApplication extends Controller {

  def index() = Action { request =>
    Ok(views.html.admin.index())
  }

}
