package controllers

import javax.inject._

import com.mariussoutier.example.model.User
import play.api.mvc._

@Singleton
class Application extends Controller {

  def index = Action {
    val user = User("Admin-User-2")
    Ok(views.html.index("Your new application is ready."))
  }

}
