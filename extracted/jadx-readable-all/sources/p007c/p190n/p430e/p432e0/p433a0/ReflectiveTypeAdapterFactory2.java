package p007c.p190n.p430e.p432e0.p433a0;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p007c.p190n.p430e.ExclusionStrategy;
import p007c.p190n.p430e.FieldAttributes;
import p007c.p190n.p430e.FieldNamingStrategy;
import p007c.p190n.p430e.JsonSyntaxException;
import p007c.p190n.p430e.TypeAdapter2;
import p007c.p190n.p430e.TypeAdapterFactory;
import p007c.p190n.p430e.p431d0.Since;
import p007c.p190n.p430e.p431d0.Until;
import p007c.p190n.p430e.p432e0.C5611g;
import p007c.p190n.p430e.p432e0.Excluder;
import p007c.p190n.p430e.p432e0.ObjectConstructor;
import p007c.p190n.p430e.p432e0.p435b0.ReflectionAccessor;
import p007c.p190n.p430e.p437g0.JsonReader2;
import p007c.p190n.p430e.p437g0.JsonToken;
import p007c.p190n.p430e.p437g0.JsonWriter;

/* JADX INFO: renamed from: c.n.e.e0.a0.j, reason: use source file name */
/* JADX INFO: compiled from: ReflectiveTypeAdapterFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class ReflectiveTypeAdapterFactory2 implements TypeAdapterFactory {

    /* JADX INFO: renamed from: f */
    public final C5611g f27364f;

    /* JADX INFO: renamed from: g */
    public final FieldNamingStrategy f27365g;

    /* JADX INFO: renamed from: h */
    public final Excluder f27366h;

    /* JADX INFO: renamed from: i */
    public final JsonAdapterAnnotationTypeAdapterFactory f27367i;

    /* JADX INFO: renamed from: j */
    public final ReflectionAccessor f27368j = ReflectionAccessor.f27456a;

    /* JADX INFO: renamed from: c.n.e.e0.a0.j$a */
    /* JADX INFO: compiled from: ReflectiveTypeAdapterFactory.java */
    public static final class a<T> extends TypeAdapter2<T> {

        /* JADX INFO: renamed from: a */
        public final ObjectConstructor<T> f27369a;

        /* JADX INFO: renamed from: b */
        public final Map<String, b> f27370b;

        public a(ObjectConstructor<T> objectConstructor, Map<String, b> map) {
            this.f27369a = objectConstructor;
            this.f27370b = map;
        }

        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: a */
        public T mo12212a(JsonReader2 jsonReader2) throws IOException {
            if (jsonReader2.mo12234H0() == JsonToken.NULL) {
                jsonReader2.mo12249z0();
                return null;
            }
            T tMo12272a = this.f27369a.mo12272a();
            try {
                jsonReader2.mo12242c();
                while (jsonReader2.mo12236O()) {
                    b bVar = this.f27370b.get(jsonReader2.mo12248u0());
                    if (bVar == null || !bVar.f27373c) {
                        jsonReader2.mo12235M0();
                    } else {
                        bVar.mo12263a(jsonReader2, tMo12272a);
                    }
                }
                jsonReader2.mo12231B();
                return tMo12272a;
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (IllegalStateException e2) {
                throw new JsonSyntaxException(e2);
            }
        }

        @Override // p007c.p190n.p430e.TypeAdapter2
        /* JADX INFO: renamed from: b */
        public void mo12213b(JsonWriter jsonWriter, T t) throws IOException {
            if (t == null) {
                jsonWriter.mo12254O();
                return;
            }
            jsonWriter.mo12256f();
            try {
                for (b bVar : this.f27370b.values()) {
                    if (bVar.mo12265c(t)) {
                        jsonWriter.mo12251D(bVar.f27371a);
                        bVar.mo12264b(jsonWriter, t);
                    }
                }
                jsonWriter.mo12250B();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* JADX INFO: renamed from: c.n.e.e0.a0.j$b */
    /* JADX INFO: compiled from: ReflectiveTypeAdapterFactory.java */
    public static abstract class b {

        /* JADX INFO: renamed from: a */
        public final String f27371a;

        /* JADX INFO: renamed from: b */
        public final boolean f27372b;

        /* JADX INFO: renamed from: c */
        public final boolean f27373c;

        public b(String str, boolean z, boolean z2) {
            this.f27371a = str;
            this.f27372b = z;
            this.f27373c = z2;
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo12263a(JsonReader2 jsonReader2, Object obj) throws IllegalAccessException, IOException;

        /* JADX INFO: renamed from: b */
        public abstract void mo12264b(JsonWriter jsonWriter, Object obj) throws IllegalAccessException, IOException;

        /* JADX INFO: renamed from: c */
        public abstract boolean mo12265c(Object obj) throws IllegalAccessException, IOException;
    }

    public ReflectiveTypeAdapterFactory2(C5611g c5611g, FieldNamingStrategy fieldNamingStrategy, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        this.f27364f = c5611g;
        this.f27365g = fieldNamingStrategy;
        this.f27366h = excluder;
        this.f27367i = jsonAdapterAnnotationTypeAdapterFactory;
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    @Override // p007c.p190n.p430e.TypeAdapterFactory
    /* JADX INFO: renamed from: a */
    public <T> p007c.p190n.p430e.TypeAdapter2<T> mo12216a(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r35v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    /* JADX INFO: renamed from: b */
    public boolean m12266b(Field field, boolean z) {
        boolean z2;
        Excluder excluder = this.f27366h;
        Class<?> type = field.getType();
        if (!(excluder.m12275b(type) || excluder.m12276d(type, z))) {
            if ((excluder.f27473h & field.getModifiers()) == 0 && ((excluder.f27472g == -1.0d || excluder.m12279i((Since) field.getAnnotation(Since.class), (Until) field.getAnnotation(Until.class))) && !field.isSynthetic() && ((excluder.f27474i || !excluder.m12278g(field.getType())) && !excluder.m12277e(field.getType())))) {
                List<ExclusionStrategy> list = z ? excluder.f27475j : excluder.f27476k;
                if (!list.isEmpty()) {
                    FieldAttributes fieldAttributes = new FieldAttributes(field);
                    Iterator<ExclusionStrategy> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().m12214a(fieldAttributes)) {
                                z2 = true;
                            }
                        }
                    }
                }
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                return true;
            }
        }
        return false;
    }
}
