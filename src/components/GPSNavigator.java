package components;

public class GPSNavigator {

  private String route;

  public GPSNavigator() {
    this.route = "54A, Oquendo Street, Cochabamba to Tarata, Cochabamba";
  }

  public GPSNavigator(String manualRoute) {
    this.route = manualRoute;
  }

  public String getRoute() {
    return route;
  }
}
