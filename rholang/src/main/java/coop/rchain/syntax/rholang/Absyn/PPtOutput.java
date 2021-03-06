package coop.rchain.syntax.rholang.Absyn; // Java Package generated by the BNF Converter.

public class PPtOutput extends PPattern {
  public final CPattern cpattern_;
  public final ListPPattern listppattern_;
  public PPtOutput(CPattern p1, ListPPattern p2) { cpattern_ = p1; listppattern_ = p2; }

  public <R,A> R accept(coop.rchain.syntax.rholang.Absyn.PPattern.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof coop.rchain.syntax.rholang.Absyn.PPtOutput) {
      coop.rchain.syntax.rholang.Absyn.PPtOutput x = (coop.rchain.syntax.rholang.Absyn.PPtOutput)o;
      return this.cpattern_.equals(x.cpattern_) && this.listppattern_.equals(x.listppattern_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.cpattern_.hashCode())+this.listppattern_.hashCode();
  }


}
