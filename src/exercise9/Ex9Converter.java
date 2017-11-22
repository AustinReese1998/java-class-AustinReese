package exercise9;

/**
 * Class Ex9Converter
 * @author yasiro01
 */
public class Ex9Converter {
  public Double c2f(Double valueFrom) {
      return (valueFrom * (9.0/5.0))+32.0;
  }

  public Double c2k(Double valueFrom) {
      return valueFrom + 273.15;
  }

  public Double f2c(Double valueFrom) {
      return (valueFrom - 32.0) * (5.0/9.0);
  }

  public Double f2k(Double valueFrom) {
      return (valueFrom - 32.0) * (5.0/9.0) + 273.15;
  }

  public Double k2c(Double valueFrom) {
      return valueFrom - 273.15;
  }

  public Double k2f(Double valueFrom) {
      return (valueFrom - 273.15) * (9.0/5.0) + 32.0;
  }
}
