/* Generated By:JJTree: Do not edit this line. ASTPrimitiveType.java */

package net.sourceforge.pmd.lang.java.ast;

public class ASTPrimitiveType extends AbstractJavaTypeNode implements Dimensionable {

    public ASTPrimitiveType(int id) {
        super(id);
    }

    public ASTPrimitiveType(JavaParser p, int id) {
        super(p, id);
    }

    public boolean isBoolean() {
        return getImage().equals("boolean");
    }

    /**
     * Accept the visitor. *
     */
    public Object jjtAccept(JavaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }

    private int arrayDepth;

    public void bumpArrayDepth() {
        arrayDepth++;
    }

    public int getArrayDepth() {
        return arrayDepth;
    }

    public boolean isArray() {
        return arrayDepth > 0;
    }

}