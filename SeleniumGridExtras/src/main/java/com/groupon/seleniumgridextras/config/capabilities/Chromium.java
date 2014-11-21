package com.groupon.seleniumgridextras.config.capabilities;

public class Chromium extends Capability {

  @Override
  public String getWebDriverClass() {
    return "io.appium.java_client.android.AndroidDriver";
  }

  public String getIcon(){
    return "iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAAAXNSR0IArs4c6QAAAARnQU1BAACxjwv8YQUAAAAJcEhZcwAADsMAAA7DAcdvqGQAAAG/SURBVDhPjZFLLwNRFMfnK/gK/QqEjQULGxZEWLBCgyASrwSJigqZeG5Qr0gr6aQ09VhUUPEI8Qip0HZMJKVKK43qlCBdHs4192ZqKpzkn3vuPff/O/fB/RXl/Ga6kv4vKnmHrmJwDVKprG8ZlG2po7DLJpcaHWQjqopfISM1Y63IsAAFHYL2VDnNZjmvTYD8ToFsKu62JwnXsJbbYiHKbprTKVaO453BNDTTolq/raMUO8cZV29g1HUPWbVTrCiGX2FfksF6FIbHeAIO/XHYvoqRNczdgRdw38bbGaDfGQD92AFkVk/CiRSCAYcEQyt+JpwT05cQTnMGwBMgJENvAtd5BDrMXjBYRTDaJDLiXH5LaCAEYFjyMwCq1y5C/YSbqHX2guUUoDkBAtBIIXjnkoEjKB8+ZsJ54OkjyYxvQQDti9dA34FC8BR5PXtMwdg7M9Nx3RuVCaDR4ttKBcEOaMSfoF2p8EeImUarIIEaogahqJF+p+Ms8t1dHY3zIoHgm6AQhiM1ojZ8z7BwGknuro4Gsw8oCDW+dUc6Oi+jxDi9c6/t/DPqTJ60mlkPoGZ2H2B8JwQjrqBdKauC4z4B0R03eArukgQAAAAASUVORK5CYII=";
  }
}
