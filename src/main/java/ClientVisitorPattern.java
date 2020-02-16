public class ClientVisitorPattern {

    public static void main(String[] args){
         MacConfiguration macConfiguration;
         LinuxConfigurator linuxConfigurator;
         DLinkRouter dLinkRouter;
         TPLinkRouter tpLinkRouter;
         LinkSysRouter linkSysRouter;

        macConfiguration = new MacConfiguration();
        linuxConfigurator = new LinuxConfigurator();

        dLinkRouter = new DLinkRouter();
        tpLinkRouter = new TPLinkRouter();
        linkSysRouter = new LinkSysRouter();

        dLinkRouter.accept(macConfiguration);
        dLinkRouter.accept(linuxConfigurator);

        tpLinkRouter.accept(macConfiguration);
        tpLinkRouter.accept(linuxConfigurator);

        linkSysRouter.accept(macConfiguration);
        linkSysRouter.accept(linuxConfigurator);
    }
}
