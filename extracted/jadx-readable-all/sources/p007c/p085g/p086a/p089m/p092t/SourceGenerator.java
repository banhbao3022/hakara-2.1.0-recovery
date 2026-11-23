package p007c.p085g.p086a.p089m.p092t;

import p007c.p085g.p086a.p089m.Key;
import p007c.p085g.p086a.p089m.p090s.DataFetcher;
import p007c.p085g.p086a.p089m.p096u.ModelLoader;

/* JADX INFO: renamed from: c.g.a.m.t.a0, reason: use source file name */
/* JADX INFO: compiled from: SourceGenerator.java */
/* JADX INFO: loaded from: classes.dex */
public class SourceGenerator implements DataFetcher.a<Object> {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ModelLoader.a f3094f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ SourceGenerator2 f3095g;

    public SourceGenerator(SourceGenerator2 sourceGenerator2, ModelLoader.a aVar) {
        this.f3095g = sourceGenerator2;
        this.f3094f = aVar;
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
    @Override // p007c.p085g.p086a.p089m.p090s.DataFetcher.a
    /* JADX INFO: renamed from: c */
    public void mo1720c(Exception exc) {
        SourceGenerator2 sourceGenerator2 = this.f3095g;
        ModelLoader.a<?> aVar = this.f3094f;
        ModelLoader.a<?> aVar2 = sourceGenerator2.f3102k;
        if (aVar2 != null && aVar2 == aVar) {
            SourceGenerator2 sourceGenerator3 = this.f3095g;
            ModelLoader.a aVar3 = this.f3094f;
            DataFetcherGenerator.a aVar4 = sourceGenerator3.f3098g;
            Key key = sourceGenerator3.f3103l;
            DataFetcher<Data> dataFetcher = aVar3.f3435c;
            aVar4.mo1735f(key, exc, dataFetcher, dataFetcher.mo1717d());
        }
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
    @Override // p007c.p085g.p086a.p089m.p090s.DataFetcher.a
    /* JADX INFO: renamed from: f */
    public void mo1721f(Object obj) {
        SourceGenerator2 sourceGenerator2 = this.f3095g;
        ModelLoader.a<?> aVar = this.f3094f;
        ModelLoader.a<?> aVar2 = sourceGenerator2.f3102k;
        if (aVar2 != null && aVar2 == aVar) {
            SourceGenerator2 sourceGenerator3 = this.f3095g;
            ModelLoader.a aVar3 = this.f3094f;
            DiskCacheStrategy diskCacheStrategy = sourceGenerator3.f3097f.f3216p;
            if (obj != null && diskCacheStrategy.mo1811c(aVar3.f3435c.mo1717d())) {
                sourceGenerator3.f3101j = obj;
                sourceGenerator3.f3098g.mo1736h();
            } else {
                DataFetcherGenerator.a aVar4 = sourceGenerator3.f3098g;
                Key key = aVar3.f3433a;
                DataFetcher<Data> dataFetcher = aVar3.f3435c;
                aVar4.mo1737j(key, obj, dataFetcher, dataFetcher.mo1717d(), sourceGenerator3.f3103l);
            }
        }
    }
}
