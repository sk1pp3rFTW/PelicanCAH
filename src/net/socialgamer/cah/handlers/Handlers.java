// This file is automatically generated. Do not edit.
package net.socialgamer.cah.handlers;

import java.util.HashMap;
import java.util.Map;


public class Handlers {
  public final static Map<String, Class<? extends Handler>> LIST;

  static {
    LIST = new HashMap<String, Class<? extends Handler>>();
    LIST.put(ChatHandler.OP, ChatHandler.class);
    LIST.put(FirstLoadHandler.OP, FirstLoadHandler.class);
    LIST.put(GameListHandler.OP, GameListHandler.class);
    LIST.put(LogoutHandler.OP, LogoutHandler.class);
    LIST.put(NamesHandler.OP, NamesHandler.class);
    LIST.put(RegisterHandler.OP, RegisterHandler.class);
  }
}
