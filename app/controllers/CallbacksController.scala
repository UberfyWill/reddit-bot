package controllers

import javax.inject.{ Inject, Singleton }

import play.api.Configuration
import play.api.mvc.Action
import play.api.mvc.Controller

@Singleton
class CallbacksController @Inject() (config: Configuration) extends Controller {
  def letsEncrypt(key: String) = Action {
    Ok(config.getString("letsencrypt.key").getOrElse(""))
  }
}
