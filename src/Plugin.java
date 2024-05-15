import jamiebalfour.zpe.core.ZPERuntimeEnvironment;
import jamiebalfour.zpe.interfaces.ZPECustomFunction;
import jamiebalfour.zpe.interfaces.ZPELibrary;

import java.util.HashMap;
import java.util.Map;

public class Plugin implements ZPELibrary {

  public class display implements ZPECustomFunction{

    @Override
    public int RequiredPermissionLevel() {
      return 0;
    }

    @Override
    public String ManualHeader() {
      return "";
    }

    @Override
    public String ManualEntry() {
      return "";
    }

    @Override
    public String CommandString() {
      return "display";
    }

    @Override
    public String[] ParameterNames() {
      return new String[0];
    }

    @Override
    public Object MainMethod(HashMap<String, Object> hashMap, ZPERuntimeEnvironment zpeRuntimeEnvironment) {
      System.out.println("This display function is working");
      return true;
    }

    @Override
    public byte ReturnType() {
      return 0;
    }

    @Override
    public int MinimumParameters() {
      return 0;
    }

    @Override
    public String ImportLines(String s) {
      return "";
    }

    @Override
    public String ConvertToLanguage(String s, String s1) {
      return "";
    }
  }

  @Override
  public ZPECustomFunction[] functions() {

    ZPECustomFunction[] funcs = new ZPECustomFunction[1];
    funcs[0] = new display();
    return funcs;
  }

  @Override
  public Map<String, Class<?>> objects() {
    return null;
  }

  @Override
  public String GetName() {
    return "LibPrint";
  }

  @Override
  public String GetVersionInfo() {
    return "1.0";
  }
}
