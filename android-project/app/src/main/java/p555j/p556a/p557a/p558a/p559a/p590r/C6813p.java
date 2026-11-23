package p555j.p556a.p557a.p558a.p559a.p590r;

import mtp.media.karaoke.p628ui.screen.process.ProcessActivity;
import mtp.media.karaoke.p628ui.screen.sing.SingActivity;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Ref;
import p636z0.p759s.Observer;

/* JADX INFO: renamed from: j.a.a.a.a.r.p */
/* JADX INFO: compiled from: SingActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C6813p<T> implements Observer<Long> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Ref f31912a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Ref f31913b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Ref f31914c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ SingActivity f31915d;

    public C6813p(Ref ref, Ref ref2, Ref ref3, SingActivity singActivity) {
        this.f31912a = ref;
        this.f31913b = ref2;
        this.f31914c = ref3;
        this.f31915d = singActivity;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p636z0.p759s.Observer
    /* JADX INFO: renamed from: d */
    public void mo410d(Long l) {
        Long l2 = l;
        ProcessActivity.C7304d c7304d = ProcessActivity.f33721w;
        SingActivity singActivity = this.f31915d;
        String str = singActivity.f33913Q;
        String str2 = singActivity.f33914R;
        Intrinsics2.m13088d(l2, "it");
        long jLongValue = l2.longValue();
        SingActivity singActivity2 = this.f31915d;
        this.f31915d.m13971T(c7304d.m14414a(singActivity, str, str2, jLongValue, Boolean.FALSE, singActivity2.f33926d0, 0, this.f31912a.f29602f, singActivity2.f33897A, this.f31913b.f29602f, this.f31914c.f29602f));
        SingActivity singActivity3 = this.f31915d;
        singActivity3.f32012v = false;
        singActivity3.finish();
    }
}
