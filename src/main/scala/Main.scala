/**
  * Created by psc on 8/02/18.
  * from https://github.com/typesafehub/scala-logging
  * also see https://github.com/typesafehub/scalalogging/issues/26
  */

import com.typesafe.scalalogging._

object Main {
  val logger = Logger(Main.getClass)  // instead of `classOf[MyClass]`

  def main(args: Array[String]): Unit = {
    // from least to most serious
    //logger.trace("trace: this is very convenient ;-)")
    logger.debug("debug: this is very convenient ;-)")
    logger.info("info: this is very convenient ;-)")
    logger.warn("warn: this is very convenient ;-)")
    logger.error("error: this is very convenient ;-)")
    //logger.fatal("fatal: this is very convenient ;-)")

  } // main
} // Main