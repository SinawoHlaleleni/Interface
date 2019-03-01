

public class AppConfig {

    @Bean

    public CalculatorInterface getService(){
        return new CalculatorServiceImpl();
    }
}
