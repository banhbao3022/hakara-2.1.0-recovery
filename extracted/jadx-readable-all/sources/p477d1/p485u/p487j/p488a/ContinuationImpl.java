package p477d1.p485u.p487j.p488a;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p007c.p071d.p078c.p079a.outline;
import p007c.p451o.p452a.C5729a;
import p477d1.Result;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p477d1.p485u.p486i.Intrinsics;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: d1.u.j.a.a, reason: use source file name */
/* JADX INFO: compiled from: ContinuationImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class ContinuationImpl implements Continuation<Object>, CoroutineStackFrame, Serializable {

    /* JADX INFO: renamed from: f */
    public final Continuation<Object> f29547f;

    public ContinuationImpl(Continuation<Object> continuation) {
        this.f29547f = continuation;
    }

    /* JADX INFO: renamed from: a */
    public Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
        Intrinsics2.m13089e(continuation, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @Override // p477d1.p485u.p487j.p488a.CoroutineStackFrame
    /* JADX INFO: renamed from: e */
    public CoroutineStackFrame mo13065e() {
        Continuation<Object> continuation = this.f29547f;
        if (!(continuation instanceof CoroutineStackFrame)) {
            continuation = null;
        }
        return (CoroutineStackFrame) continuation;
    }

    @Override // p477d1.p485u.Continuation
    /* JADX INFO: renamed from: g */
    public final void mo13056g(Object obj) {
        ContinuationImpl continuationImpl = this;
        while (true) {
            Intrinsics2.m13089e(continuationImpl, "frame");
            Continuation<Object> continuation = continuationImpl.f29547f;
            Intrinsics2.m13087c(continuation);
            try {
                obj = continuationImpl.mo6m(obj);
                if (obj == Intrinsics.COROUTINE_SUSPENDED) {
                    return;
                }
                Result.a aVar = Result.f29493f;
                Result.a aVar2 = Result.f29493f;
            } catch (Throwable th) {
                Result.a aVar3 = Result.f29493f;
                obj = C5729a.m12456k(th);
            }
            continuationImpl.mo13067n();
            if (!(continuation instanceof ContinuationImpl)) {
                continuation.mo13056g(obj);
                return;
            }
            continuationImpl = (ContinuationImpl) continuation;
        }
    }

    /* JADX INFO: renamed from: k */
    public StackTraceElement m13066k() {
        int iIntValue;
        String strM13068c;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        Intrinsics2.m13089e(this, "$this$getStackTraceElementImpl");
        DebugMetadata debugMetadata = (DebugMetadata) getClass().getAnnotation(DebugMetadata.class);
        String str = null;
        str = null;
        str = null;
        str = null;
        str = null;
        if (debugMetadata == null) {
            return null;
        }
        int iM13072v = debugMetadata.m13072v();
        if (iM13072v > 1) {
            throw new IllegalStateException(outline.m1593o("Debug metadata version mismatch. Expected: ", 1, ", got ", iM13072v, ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            Intrinsics2.m13088d(declaredField, "field");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            if (!(obj instanceof Integer)) {
                obj = null;
            }
            Integer num = (Integer) obj;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? debugMetadata.m13070l()[iIntValue] : -1;
        DebugMetadata2 debugMetadata2 = DebugMetadata2.f29553c;
        Intrinsics2.m13089e(this, "continuation");
        DebugMetadata2.a aVar = DebugMetadata2.f29552b;
        if (aVar == null) {
            try {
                DebugMetadata2.a aVar2 = new DebugMetadata2.a(Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
                DebugMetadata2.f29552b = aVar2;
                aVar = aVar2;
            } catch (Exception unused2) {
                aVar = DebugMetadata2.f29551a;
                DebugMetadata2.f29552b = aVar;
            }
        }
        if (aVar != DebugMetadata2.f29551a && (method = aVar.f29554a) != null && (objInvoke = method.invoke(getClass(), new Object[0])) != null && (method2 = aVar.f29555b) != null && (objInvoke2 = method2.invoke(objInvoke, new Object[0])) != null) {
            Method method3 = aVar.f29556c;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, new Object[0]) : null;
            str = (String) (objInvoke3 instanceof String ? objInvoke3 : null);
        }
        if (str == null) {
            strM13068c = debugMetadata.m13068c();
        } else {
            strM13068c = str + '/' + debugMetadata.m13068c();
        }
        return new StackTraceElement(strM13068c, debugMetadata.m13071m(), debugMetadata.m13069f(), i);
    }

    /* JADX INFO: renamed from: m */
    public abstract Object mo6m(Object obj);

    /* JADX INFO: renamed from: n */
    public void mo13067n() {
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Continuation at ");
        Object objM13066k = m13066k();
        if (objM13066k == null) {
            objM13066k = getClass().getName();
        }
        sbM1556G.append(objM13066k);
        return sbM1556G.toString();
    }
}
