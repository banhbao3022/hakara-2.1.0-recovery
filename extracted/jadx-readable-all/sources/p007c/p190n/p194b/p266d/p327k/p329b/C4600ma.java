package p007c.p190n.p194b.p266d.p327k.p329b;

import java.math.BigDecimal;
import p007c.p190n.p194b.p266d.p314j.p325k.C4235l1;
import p007c.p190n.p194b.p266d.p314j.p325k.C4290p0;
import p007c.p190n.p194b.p266d.p314j.p325k.C4313q9;
import p007c.p190n.p194b.p266d.p314j.p325k.C4318r0;

/* JADX INFO: renamed from: c.n.b.d.k.b.ma */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4600ma extends AbstractC4564ja {

    /* JADX INFO: renamed from: g */
    public C4318r0 f24168g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C4528ga f24169h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4600ma(C4528ga c4528ga, String str, int i, C4318r0 c4318r0) {
        super(str, i);
        this.f24169h = c4528ga;
        this.f24168g = c4318r0;
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.AbstractC4564ja
    /* JADX INFO: renamed from: a */
    public final int mo10617a() {
        return this.f24168g.m10179u();
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.AbstractC4564ja
    /* JADX INFO: renamed from: g */
    public final boolean mo10618g() {
        return true;
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.AbstractC4564ja
    /* JADX INFO: renamed from: h */
    public final boolean mo10619h() {
        return false;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: i */
    public final boolean m10649i(Long l, Long l2, C4235l1 c4235l1, boolean z) {
        boolean z2 = C4313q9.m10173a() && this.f24169h.f24476a.f24534h.m10423u(this.f24043a, C4647r.f24338a0);
        boolean zM10182x = this.f24168g.m10182x();
        boolean zM10183y = this.f24168g.m10183y();
        boolean zM10177A = this.f24168g.m10177A();
        boolean z3 = zM10182x || zM10183y || zM10177A;
        Boolean boolM10613c = null;
        Boolean boolM10616f = null;
        boolM10613c = null;
        boolM10613c = null;
        boolM10613c = null;
        boolM10613c = null;
        if (z && !z3) {
            this.f24169h.mo10684l().f24426n.m10813c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f24044b), this.f24168g.m10178t() ? Integer.valueOf(this.f24168g.m10179u()) : null);
            return true;
        }
        C4290p0 c4290p0M10181w = this.f24168g.m10181w();
        boolean zM10132y = c4290p0M10181w.m10132y();
        if (c4235l1.m9934F()) {
            if (c4290p0M10181w.m10129v()) {
                boolM10613c = AbstractC4564ja.m10613c(AbstractC4564ja.m10612b(c4235l1.m9935G(), c4290p0M10181w.m10130w()), zM10132y);
            } else {
                this.f24169h.mo10684l().f24421i.m10812b("No number filter for long property. property", this.f24169h.m10816e().m10721y(c4235l1.m9931B()));
            }
        } else if (c4235l1.m9936H()) {
            if (c4290p0M10181w.m10129v()) {
                double dM9937I = c4235l1.m9937I();
                try {
                    boolM10616f = AbstractC4564ja.m10616f(new BigDecimal(dM9937I), c4290p0M10181w.m10130w(), Math.ulp(dM9937I));
                } catch (NumberFormatException unused) {
                }
                boolM10613c = AbstractC4564ja.m10613c(boolM10616f, zM10132y);
            } else {
                this.f24169h.mo10684l().f24421i.m10812b("No number filter for double property. property", this.f24169h.m10816e().m10721y(c4235l1.m9931B()));
            }
        } else if (!c4235l1.m9932D()) {
            this.f24169h.mo10684l().f24421i.m10812b("User property has no value, property", this.f24169h.m10816e().m10721y(c4235l1.m9931B()));
        } else if (c4290p0M10181w.m10127t()) {
            boolM10613c = AbstractC4564ja.m10613c(AbstractC4564ja.m10615e(c4235l1.m9933E(), c4290p0M10181w.m10128u(), this.f24169h.mo10684l()), zM10132y);
        } else if (!c4290p0M10181w.m10129v()) {
            this.f24169h.mo10684l().f24421i.m10812b("No string or number filter defined. property", this.f24169h.m10816e().m10721y(c4235l1.m9931B()));
        } else if (C4679t9.m10791P(c4235l1.m9933E())) {
            boolM10613c = AbstractC4564ja.m10613c(AbstractC4564ja.m10614d(c4235l1.m9933E(), c4290p0M10181w.m10130w()), zM10132y);
        } else {
            this.f24169h.mo10684l().f24421i.m10813c("Invalid user property value for Numeric number filter. property, value", this.f24169h.m10816e().m10721y(c4235l1.m9931B()), c4235l1.m9933E());
        }
        this.f24169h.mo10684l().f24426n.m10812b("Property filter result", boolM10613c == null ? "null" : boolM10613c);
        if (boolM10613c == null) {
            return false;
        }
        this.f24045c = Boolean.TRUE;
        if (zM10177A && !boolM10613c.booleanValue()) {
            return true;
        }
        if (!z || this.f24168g.m10182x()) {
            this.f24046d = boolM10613c;
        }
        if (boolM10613c.booleanValue() && z3 && c4235l1.m9938w()) {
            long jM9939x = c4235l1.m9939x();
            if (l != null) {
                jM9939x = l.longValue();
            }
            if (z2 && this.f24168g.m10182x() && !this.f24168g.m10183y() && l2 != null) {
                jM9939x = l2.longValue();
            }
            if (this.f24168g.m10183y()) {
                this.f24048f = Long.valueOf(jM9939x);
            } else {
                this.f24047e = Long.valueOf(jM9939x);
            }
        }
        return true;
    }
}
