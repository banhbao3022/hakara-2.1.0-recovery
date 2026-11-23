package p477d1.p493x.p495c;

/* JADX INFO: renamed from: d1.x.c.t, reason: use source file name */
/* JADX INFO: compiled from: ReflectionFactory.java */
/* JADX INFO: loaded from: classes.dex */
public class ReflectionFactory {
    /* JADX INFO: renamed from: a */
    public String m13098a(FunctionBase functionBase) {
        String string = functionBase.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }
}
