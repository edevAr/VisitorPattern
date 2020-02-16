public interface RouterVisitor {
    public void visit(DLinkRouter router);
    public void visit(TPLinkRouter tpLinkRouter);
    public void visit(LinkSysRouter router);
}
