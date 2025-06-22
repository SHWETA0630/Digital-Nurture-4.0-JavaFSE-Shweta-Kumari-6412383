package DecoratorPatternExample;

public class Main {
    public static void main(String[] args) {
        Notifier baseNotifier = new EmailNotifier();

        Notifier smsNotifier = new SMSNotifierDecorator(baseNotifier);
        Notifier slackAndSmsNotifier = new SlackNotifierDecorator(smsNotifier);

        System.out.println("Sending notification through all channels:");
        slackAndSmsNotifier.send("System update at 6 PM.");
    }
}
