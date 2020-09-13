package unmsm.dyc.visitor.pattern.code.visitable;

import unmsm.dyc.visitor.pattern.code.AutoParte;
import unmsm.dyc.visitor.pattern.code.AutoParteVisitor;

public class Engine implements AutoParte {
    public void accept(final AutoParteVisitor visitor) {
        visitor.visit(this);
    }
}