import jamiebalfour.zpe.core.ZPERuntimeEnvironment;
import jamiebalfour.zpe.core.ZPEStructure;
import jamiebalfour.zpe.interfaces.ZPECustomFunction;
import jamiebalfour.zpe.interfaces.ZPELibrary;

import java.util.HashMap;
import java.util.Map;

public class Plugin implements ZPELibrary {

  public class display implements ZPECustomFunction{

    @Override
    public int getRequiredPermissionLevel() {
      return 0;
    }

    @Override
    public String getManualHeader() {
      return "";
    }

    @Override
    public String getManualEntry() {
      return "";
    }

    @Override
    public String[] getParameterNames() {
      return new String[0];
    }

    @Override
    public Object MainMethod(HashMap<String, Object> hashMap, ZPERuntimeEnvironment zpeRuntimeEnvironment) {
      System.out.println("This display function is working");
      return true;
    }

    @Override
    public byte getReturnType() {
      return 0;
    }

    @Override
    public int getMinimumParameters() {
      return 0;
    }

  }

  @Override
  public Map<String, ZPECustomFunction> getFunctions() {

    Map<String, ZPECustomFunction> funcs = new HashMap<String, ZPECustomFunction>();
    funcs.put("display", new display());
    return funcs;
  }

  @Override
  public Map<String, Class<? extends ZPEStructure>> getObjects() {
    return null;
  }

  @Override
  public String getName() {
    return "libZPE-Print";
  }

  @Override
  public String getVersionInfo() {
    return "1.0";
  }
}
