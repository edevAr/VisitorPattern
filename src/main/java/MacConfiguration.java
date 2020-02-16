public class MacConfiguration implements RouterVisitor {
    public void visit(DLinkRouter router) {
        System.out.println("DLinkRouter Configuration for Mac complete !!");
    }

    public void visit(TPLinkRouter tpLinkRouter) {
        System.out.println("TPLinkRouter Configuration for Mac complete !!");
    }

    public void visit(LinkSysRouter router) {
        System.out.println("LinkSysRouter Configuration for Mac complete !!");
    }
}
