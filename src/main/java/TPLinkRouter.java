public class TPLinkRouter implements Router {
    public void sendData(char[] data) {

    }

    public void acceptData(char[] data) {

    }

    public void accept(RouterVisitor routervisitor) {
        routervisitor.visit(this);
    }
}
