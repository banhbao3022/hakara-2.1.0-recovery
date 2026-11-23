package p007c.p451o.p452a;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineExceptionHandler;
import mtp.media.karaoke.R;
import p007c.p071d.p078c.p079a.outline;
import p007c.p451o.p452a.p453c.p454a.ViewPager2;
import p007c.p466p.p467a.p468a.CropImage2;
import p477d1.Exceptions;
import p477d1.Result;
import p477d1.TypeCastException;
import p477d1.Unit;
import p477d1.p479b0.KClass;
import p477d1.p481d0.CharJVM;
import p477d1.p485u.Continuation;
import p477d1.p485u.ContinuationInterceptor;
import p477d1.p485u.CoroutineContext;
import p477d1.p485u.CoroutineContextImpl4;
import p477d1.p485u.p486i.Intrinsics;
import p477d1.p485u.p486i.IntrinsicsJvm;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p494b.InterfaceC6169q;
import p477d1.p493x.p495c.ClassBasedDeclarationContainer;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.TypeIntrinsics;
import p500e1.p501a.C6264f1;
import p500e1.p501a.C6269h0;
import p500e1.p501a.C6273i1;
import p500e1.p501a.C6276j1;
import p500e1.p501a.C6303s1;
import p500e1.p501a.CancellableContinuation;
import p500e1.p501a.CancellableContinuation2;
import p500e1.p501a.CancellableContinuationImpl4;
import p500e1.p501a.CompletableJob;
import p500e1.p501a.CompletionState2;
import p500e1.p501a.CompletionState3;
import p500e1.p501a.CoroutineContext3;
import p500e1.p501a.CoroutineContext4;
import p500e1.p501a.CoroutineDispatcher;
import p500e1.p501a.CoroutineExceptionHandlerImpl;
import p500e1.p501a.CoroutineScope;
import p500e1.p501a.DefaultExecutor2;
import p500e1.p501a.Delay;
import p500e1.p501a.DispatchedTask;
import p500e1.p501a.Executors2;
import p500e1.p501a.Executors6;
import p500e1.p501a.Job;
import p500e1.p501a.Job2;
import p500e1.p501a.p503c2.DispatchedContinuation;
import p500e1.p501a.p503c2.DispatchedContinuation2;
import p500e1.p501a.p503c2.Scopes;
import p500e1.p501a.p503c2.Scopes2;
import p500e1.p501a.p503c2.SystemProps;
import p500e1.p501a.p503c2.ThreadContext;
import p636z0.p667e.p676b.C7804v0;

/* JADX INFO: renamed from: c.o.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5729a {
    /* JADX INFO: renamed from: A */
    public static Job m12428A(CoroutineScope coroutineScope, CoroutineContext coroutineContext, int i, InterfaceC6168p interfaceC6168p, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coroutineContext = CoroutineContextImpl4.f29535f;
        }
        if ((i2 & 2) != 0) {
            i = 1;
        }
        CoroutineContext coroutineContextM13297a = CoroutineContext4.m13297a(coroutineScope, coroutineContext);
        C7804v0.m15317f(i);
        C6303s1 c6276j1 = i == 2 ? new C6276j1(coroutineContextM13297a, interfaceC6168p) : new C6303s1(coroutineContextM13297a, true);
        c6276j1.m13114U(i, c6276j1, interfaceC6168p);
        return c6276j1;
    }

    /* JADX INFO: renamed from: B */
    public static final void m12429B(View view) {
        Intrinsics2.m13090f(view, "$this$makeGone");
        view.setVisibility(8);
    }

    /* JADX INFO: renamed from: C */
    public static final void m12430C(View view) {
        Intrinsics2.m13090f(view, "$this$makeVisible");
        view.setVisibility(0);
    }

    /* JADX INFO: renamed from: D */
    public static final int m12431D(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }

    /* JADX INFO: renamed from: E */
    public static final <T> Object m12432E(Object obj, Continuation<? super T> continuation) {
        if (obj instanceof CompletionState2) {
            Result.a aVar = Result.f29493f;
            return m12456k(((CompletionState2) obj).f29810b);
        }
        Result.a aVar2 = Result.f29493f;
        return obj;
    }

    /* JADX INFO: renamed from: F */
    public static final void m12433F(View view, int i, int i2) {
        Intrinsics2.m13090f(view, "$this$requestNewSize");
        view.getLayoutParams().width = i;
        view.getLayoutParams().height = i2;
        view.setLayoutParams(view.getLayoutParams());
    }

    /* JADX INFO: renamed from: G */
    public static final <T> void m12434G(DispatchedTask<? super T> dispatchedTask, Continuation<? super T> continuation, boolean z) {
        Object objMo13257d;
        Object objMo13136h = dispatchedTask.mo13136h();
        Throwable thMo13256c = dispatchedTask.mo13256c(objMo13136h);
        if (thMo13256c != null) {
            Result.a aVar = Result.f29493f;
            objMo13257d = m12456k(thMo13256c);
        } else {
            Result.a aVar2 = Result.f29493f;
            objMo13257d = dispatchedTask.mo13257d(objMo13136h);
        }
        if (!z) {
            continuation.mo13056g(objMo13257d);
            return;
        }
        Objects.requireNonNull(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T>");
        DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) continuation;
        Continuation<T> continuation2 = dispatchedContinuation.f29646m;
        Object obj = dispatchedContinuation.f29644k;
        CoroutineContext context = continuation2.getContext();
        Object objM13164b = ThreadContext.m13164b(context, obj);
        CoroutineContext3<?> coroutineContext3M13298b = objM13164b != ThreadContext.f29671a ? CoroutineContext4.m13298b(continuation2, context, objM13164b) : null;
        try {
            dispatchedContinuation.f29646m.mo13056g(objMo13257d);
        } finally {
            if (coroutineContext3M13298b == null || coroutineContext3M13298b.m13296V()) {
                ThreadContext.m13163a(context, objM13164b);
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public static void m12435H(InterfaceC6168p interfaceC6168p, Object obj, Continuation continuation, InterfaceC6164l interfaceC6164l, int i) {
        int i2 = i & 4;
        try {
            Continuation continuationM13064b = IntrinsicsJvm.m13064b(IntrinsicsJvm.m13063a(interfaceC6168p, obj, continuation));
            Result.a aVar = Result.f29493f;
            DispatchedContinuation2.m13141a(continuationM13064b, Unit.f29502a, null);
        } catch (Throwable th) {
            Result.a aVar2 = Result.f29493f;
            continuation.mo13056g(m12456k(th));
        }
    }

    /* JADX INFO: renamed from: I */
    public static void m12436I(Activity activity) {
        Intent intent;
        String string = activity.getString(R.string.pick_image_intent_chooser_title);
        ArrayList arrayList = new ArrayList();
        PackageManager packageManager = activity.getPackageManager();
        if (!m12469x(activity)) {
            ArrayList arrayList2 = new ArrayList();
            Uri uriM12460o = m12460o(activity);
            Intent intent2 = new Intent("android.media.action.IMAGE_CAPTURE");
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent2, 0)) {
                Intent intent3 = new Intent(intent2);
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                intent3.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                intent3.setPackage(resolveInfo.activityInfo.packageName);
                if (uriM12460o != null) {
                    intent3.putExtra("output", uriM12460o);
                }
                arrayList2.add(intent3);
            }
            arrayList.addAll(arrayList2);
        }
        List<Intent> listM12462q = m12462q(packageManager, "android.intent.action.GET_CONTENT", false);
        if (((ArrayList) listM12462q).size() == 0) {
            listM12462q = m12462q(packageManager, "android.intent.action.PICK", false);
        }
        arrayList.addAll(listM12462q);
        if (arrayList.isEmpty()) {
            intent = new Intent();
        } else {
            intent = (Intent) arrayList.get(arrayList.size() - 1);
            arrayList.remove(arrayList.size() - 1);
        }
        Intent intentCreateChooser = Intent.createChooser(intent, string);
        intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[arrayList.size()]));
        activity.startActivityForResult(intentCreateChooser, 200);
    }

    /* JADX INFO: renamed from: J */
    public static final <T, R> Object m12437J(Scopes2<? super T> scopes2, R r, InterfaceC6168p<? super R, ? super Continuation<? super T>, ? extends Object> interfaceC6168p) throws Throwable {
        Object completionState2;
        Object objM13221C;
        scopes2.m13112S();
        try {
            if (interfaceC6168p == null) {
                throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
            }
            TypeIntrinsics.m13099a(interfaceC6168p, 2);
            completionState2 = interfaceC6168p.mo5l(r, scopes2);
            Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
            if (completionState2 == intrinsics || (objM13221C = scopes2.m13221C(completionState2)) == C6273i1.f29756b) {
                return intrinsics;
            }
            if (objM13221C instanceof CompletionState2) {
                throw ((CompletionState2) objM13221C).f29810b;
            }
            return C6273i1.m13259a(objM13221C);
        } catch (Throwable th) {
            completionState2 = new CompletionState2(th, false, 2, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006f A[PHI: r14
  0x006f: PHI (r14v2 long) = (r14v1 long), (r14v7 long) binds: [B:24:0x0061, B:28:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x007d A[LOOP:0: B:19:0x004b->B:33:0x007d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x007b A[SYNTHETIC] */
    /* JADX INFO: renamed from: K */
    public static final long m12438K(String str, long j2, long j3, long j4) {
        Long lValueOf;
        long j5;
        long j6;
        long j7;
        String strM12439L = m12439L(str);
        if (strM12439L == null) {
            return j2;
        }
        Intrinsics2.m13089e(strM12439L, "$this$toLongOrNull");
        Intrinsics2.m13089e(strM12439L, "$this$toLongOrNull");
        CharJVM.m12978a(10);
        int length = strM12439L.length();
        if (length != 0) {
            boolean z = false;
            char cCharAt = strM12439L.charAt(0);
            long j8 = -9223372036854775807L;
            int i = 1;
            if (Intrinsics2.m13091g(cCharAt, 48) < 0) {
                if (length != 1) {
                    if (cCharAt == '-') {
                        j8 = Long.MIN_VALUE;
                        z = true;
                    } else if (cCharAt == '+') {
                    }
                }
                lValueOf = null;
                break;
            }
            i = 0;
            long j9 = 0;
            long j10 = -256204778801521550L;
            while (true) {
                if (i >= length) {
                    if (!z) {
                        lValueOf = Long.valueOf(-j9);
                        break;
                    }
                    lValueOf = Long.valueOf(j9);
                    break;
                }
                int i2 = length;
                int iDigit = Character.digit((int) strM12439L.charAt(i), 10);
                if (iDigit >= 0) {
                    if (j9 >= j10) {
                        j5 = j10;
                        j6 = j9 * ((long) 10);
                        j7 = iDigit;
                        if (j6 < j8 + j7) {
                            j9 = j6 - j7;
                            i++;
                            length = i2;
                            j10 = j5;
                        }
                    } else if (j10 == -256204778801521550L) {
                        j10 = j8 / ((long) 10);
                        if (j9 >= j10) {
                            j5 = j10;
                            j6 = j9 * ((long) 10);
                            j7 = iDigit;
                            if (j6 < j8 + j7) {
                                j9 = j6 - j7;
                                i++;
                                length = i2;
                                j10 = j5;
                            }
                        }
                    }
                }
                lValueOf = null;
                break;
            }
        }
        lValueOf = null;
        break;
        if (lValueOf == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + strM12439L + '\'').toString());
        }
        long jLongValue = lValueOf.longValue();
        if (j3 <= jLongValue && j4 >= jLongValue) {
            return jLongValue;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("System property '");
        sb.append(str);
        sb.append("' should be in range ");
        sb.append(j3);
        outline.m1570U(sb, "..", j4, ", but is '");
        sb.append(jLongValue);
        sb.append('\'');
        throw new IllegalStateException(sb.toString().toString());
    }

    /* JADX INFO: renamed from: L */
    public static final String m12439L(String str) {
        int i = SystemProps.f29670a;
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: M */
    public static int m12440M(String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return (int) m12438K(str, i, i2, i3);
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ long m12441N(String str, long j2, long j3, long j4, int i, Object obj) {
        if ((i & 4) != 0) {
            j3 = 1;
        }
        long j5 = j3;
        if ((i & 8) != 0) {
            j4 = Long.MAX_VALUE;
        }
        return m12438K(str, j2, j5, j4);
    }

    /* JADX INFO: renamed from: O */
    public static final void m12442O(Object obj) throws Throwable {
        if (obj instanceof Result.b) {
            throw ((Result.b) obj).f29494f;
        }
    }

    /* JADX INFO: renamed from: P */
    public static final String m12443P(Continuation<?> continuation) {
        Object objM12456k;
        if (continuation instanceof DispatchedContinuation) {
            return continuation.toString();
        }
        try {
            Result.a aVar = Result.f29493f;
            objM12456k = continuation + '@' + m12463r(continuation);
        } catch (Throwable th) {
            Result.a aVar2 = Result.f29493f;
            objM12456k = m12456k(th);
        }
        if (Result.m13022a(objM12456k) != null) {
            objM12456k = continuation.getClass().getName() + '@' + m12463r(continuation);
        }
        return (String) objM12456k;
    }

    /* JADX INFO: renamed from: Q */
    public static final <T> Object m12444Q(Object obj, InterfaceC6164l<? super Throwable, Unit> interfaceC6164l) {
        Throwable thM13022a = Result.m13022a(obj);
        if (thM13022a == null) {
            return interfaceC6164l != null ? new CompletionState3(obj, interfaceC6164l) : obj;
        }
        return new CompletionState2(thM13022a, false, 2, null);
    }

    /* JADX INFO: renamed from: R */
    public static final <T> Object m12445R(CoroutineContext coroutineContext, InterfaceC6168p<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> interfaceC6168p, Continuation<? super T> continuation) throws Throwable {
        Object objM13219V;
        CoroutineContext context = continuation.getContext();
        CoroutineContext coroutineContextPlus = context.plus(coroutineContext);
        m12454i(coroutineContextPlus);
        if (coroutineContextPlus == context) {
            Scopes2 scopes2 = new Scopes2(coroutineContextPlus, continuation);
            objM13219V = m12437J(scopes2, scopes2, interfaceC6168p);
        } else {
            int i = ContinuationInterceptor.f29532c;
            ContinuationInterceptor.a aVar = ContinuationInterceptor.a.f29533f;
            if (Intrinsics2.m13085a((ContinuationInterceptor) coroutineContextPlus.get(aVar), (ContinuationInterceptor) context.get(aVar))) {
                CoroutineContext3 coroutineContext3 = new CoroutineContext3(coroutineContextPlus, continuation);
                Object objM13164b = ThreadContext.m13164b(coroutineContextPlus, null);
                try {
                    Object objM12437J = m12437J(coroutineContext3, coroutineContext3, interfaceC6168p);
                    ThreadContext.m13163a(coroutineContextPlus, objM13164b);
                    objM13219V = objM12437J;
                } catch (Throwable th) {
                    ThreadContext.m13163a(coroutineContextPlus, objM13164b);
                    throw th;
                }
            } else {
                C6269h0 c6269h0 = new C6269h0(coroutineContextPlus, continuation);
                c6269h0.m13112S();
                m12435H(interfaceC6168p, c6269h0, c6269h0, null, 4);
                objM13219V = c6269h0.m13219V();
            }
        }
        if (objM13219V == Intrinsics.COROUTINE_SUSPENDED) {
            Intrinsics2.m13089e(continuation, "frame");
        }
        return objM13219V;
    }

    /* JADX INFO: renamed from: a */
    public static final CoroutineScope m12446a(CoroutineContext coroutineContext) {
        if (coroutineContext.get(Job.f29633e) == null) {
            coroutineContext = coroutineContext.plus(m12447b(null, 1, null));
        }
        return new Scopes(coroutineContext);
    }

    /* JADX INFO: renamed from: b */
    public static CompletableJob m12447b(Job job, int i, Object obj) {
        int i2 = i & 1;
        return new C6264f1(null);
    }

    /* JADX INFO: renamed from: c */
    public static CropImage2 m12448c(Uri uri) {
        return new CropImage2(uri, null);
    }

    /* JADX INFO: renamed from: d */
    public static ViewPager.InterfaceC0201j m12449d(ViewPager viewPager, InterfaceC6169q interfaceC6169q, InterfaceC6164l interfaceC6164l, InterfaceC6164l interfaceC6164l2, int i) {
        int i2 = i & 1;
        if ((i & 2) != 0) {
            interfaceC6164l = null;
        }
        if ((i & 4) != 0) {
            interfaceC6164l2 = null;
        }
        Intrinsics2.m13090f(viewPager, "$this$addOnPageChangeListener");
        ViewPager2 viewPager2 = new ViewPager2(null, interfaceC6164l, interfaceC6164l2);
        if (viewPager.f1247d0 == null) {
            viewPager.f1247d0 = new ArrayList();
        }
        viewPager.f1247d0.add(viewPager2);
        return viewPager2;
    }

    /* JADX INFO: renamed from: e */
    public static final void m12450e(View view, Float f, Float f2, long j2) {
        Intrinsics2.m13090f(view, "$this$animateAlpha");
        view.setAlpha(f != null ? f.floatValue() : 0.0f);
        view.clearAnimation();
        view.animate().alpha(f2 != null ? f2.floatValue() : 0.0f).setDuration(j2).start();
    }

    /* JADX INFO: renamed from: f */
    public static final void m12451f(View view, Integer num, Integer num2, Integer num3, Integer num4) {
        Intrinsics2.m13090f(view, "$this$applyMargin");
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(num != null ? num.intValue() : marginLayoutParams.getMarginStart());
            marginLayoutParams.topMargin = num2 != null ? num2.intValue() : marginLayoutParams.topMargin;
            marginLayoutParams.setMarginEnd(num3 != null ? num3.intValue() : marginLayoutParams.getMarginEnd());
            marginLayoutParams.bottomMargin = num4 != null ? num4.intValue() : marginLayoutParams.bottomMargin;
            view.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m12452g(CoroutineContext coroutineContext, CancellationException cancellationException, int i, Object obj) {
        int i2 = i & 1;
        Job job = (Job) coroutineContext.get(Job.f29633e);
        if (job != null) {
            job.mo13129t0(null);
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m12453h(Job job, CancellationException cancellationException, int i, Object obj) {
        int i2 = i & 1;
        job.mo13129t0(null);
    }

    /* JADX INFO: renamed from: i */
    public static final void m12454i(CoroutineContext coroutineContext) {
        Job job = (Job) coroutineContext.get(Job.f29633e);
        if (job != null && !job.mo13115a()) {
            throw job.mo13127H();
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m12455j(Closeable closeable, Throwable th) throws IOException {
        if (closeable == null) {
            return;
        }
        if (th == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th2) {
            Exceptions.m12964a(th, th2);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final Object m12456k(Throwable th) {
        Intrinsics2.m13089e(th, "exception");
        return new Result.b(th);
    }

    /* JADX INFO: renamed from: l */
    public static final Object m12457l(long j2, Continuation<? super Unit> continuation) {
        if (j2 <= 0) {
            return Unit.f29502a;
        }
        CancellableContinuationImpl4 cancellableContinuationImpl4 = new CancellableContinuationImpl4(IntrinsicsJvm.m13064b(continuation), 1);
        cancellableContinuationImpl4.m13271x();
        if (j2 < Long.MAX_VALUE) {
            CoroutineContext coroutineContext = cancellableContinuationImpl4.f29764k;
            int i = ContinuationInterceptor.f29532c;
            CoroutineContext.a aVar = coroutineContext.get(ContinuationInterceptor.a.f29533f);
            if (!(aVar instanceof Delay)) {
                aVar = null;
            }
            Delay delay = (Delay) aVar;
            if (delay == null) {
                delay = DefaultExecutor2.f29741a;
            }
            delay.mo13123h(j2, cancellableContinuationImpl4);
        }
        Object objM13268s = cancellableContinuationImpl4.m13268s();
        if (objM13268s == Intrinsics.COROUTINE_SUSPENDED) {
            Intrinsics2.m13089e(continuation, "frame");
        }
        return objM13268s;
    }

    /* JADX INFO: renamed from: m */
    public static final void m12458m(CancellableContinuation<?> cancellableContinuation, Job2 job2) {
        cancellableContinuation.mo13254i(new CancellableContinuation2(job2));
    }

    /* JADX INFO: renamed from: n */
    public static final CoroutineDispatcher m12459n(Executor executor) {
        CoroutineDispatcher coroutineDispatcher;
        Executors2 executors2 = (Executors2) (!(executor instanceof Executors2) ? null : executor);
        return (executors2 == null || (coroutineDispatcher = executors2.f29766f) == null) ? new Executors6(executor) : coroutineDispatcher;
    }

    /* JADX INFO: renamed from: o */
    public static Uri m12460o(Context context) {
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir != null) {
            return Uri.fromFile(new File(externalCacheDir.getPath(), "pickImageResult.jpeg"));
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public static final String m12461p(Object obj) {
        return obj.getClass().getSimpleName();
    }

    /* JADX INFO: renamed from: q */
    public static List<Intent> m12462q(PackageManager packageManager, String str, boolean z) {
        ArrayList<Intent> arrayList = new ArrayList();
        Intent intent = str == "android.intent.action.GET_CONTENT" ? new Intent(str) : new Intent(str, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        intent.setType("image/*");
        for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 0)) {
            Intent intent2 = new Intent(intent);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            arrayList.add(intent2);
        }
        if (!z) {
            for (Intent intent3 : arrayList) {
                if (intent3.getComponent().getClassName().equals("com.android.documentsui.DocumentsActivity")) {
                    arrayList.remove(intent3);
                    break;
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: r */
    public static final String m12463r(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* JADX INFO: renamed from: s */
    public static final <T> Class<T> m12464s(KClass<T> kClass) {
        Intrinsics2.m13089e(kClass, "$this$java");
        Class<T> cls = (Class<T>) ((ClassBasedDeclarationContainer) kClass).mo13082b();
        Objects.requireNonNull(cls, "null cannot be cast to non-null type java.lang.Class<T>");
        return cls;
    }

    /* JADX INFO: renamed from: t */
    public static final <T> Class<T> m12465t(KClass<T> kClass) {
        Intrinsics2.m13089e(kClass, "$this$javaObjectType");
        Class<T> cls = (Class<T>) ((ClassBasedDeclarationContainer) kClass).mo13082b();
        if (!cls.isPrimitive()) {
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return name.equals("double") ? Double.class : cls;
            case 104431:
                return name.equals("int") ? Integer.class : cls;
            case 3039496:
                return name.equals("byte") ? Byte.class : cls;
            case 3052374:
                return name.equals("char") ? Character.class : cls;
            case 3327612:
                return name.equals("long") ? Long.class : cls;
            case 3625364:
                return name.equals("void") ? Void.class : cls;
            case 64711720:
                return name.equals("boolean") ? Boolean.class : cls;
            case 97526364:
                return name.equals("float") ? Float.class : cls;
            case 109413500:
                return name.equals("short") ? Short.class : cls;
            default:
                return cls;
        }
    }

    /* JADX INFO: renamed from: u */
    public static final void m12466u(CoroutineContext coroutineContext, Throwable th) {
        try {
            int i = CoroutineExceptionHandler.f33299d;
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) coroutineContext.get(CoroutineExceptionHandler.C7217a.f33300f);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(coroutineContext, th);
            } else {
                CoroutineExceptionHandlerImpl.m13121a(coroutineContext, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                Exceptions.m12964a(runtimeException, th);
                th = runtimeException;
            }
            CoroutineExceptionHandlerImpl.m13121a(coroutineContext, th);
        }
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ Job2 m12467v(Job job, boolean z, boolean z2, InterfaceC6164l interfaceC6164l, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return job.mo13125D(z, z2, interfaceC6164l);
    }

    /* JADX INFO: renamed from: w */
    public static final boolean m12468w(int i) {
        return i == 1 || i == 2;
    }

    /* JADX INFO: renamed from: x */
    public static boolean m12469x(Context context) {
        boolean z;
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            if (strArr != null && strArr.length > 0) {
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = false;
                        break;
                    }
                    if (strArr[i].equalsIgnoreCase("android.permission.CAMERA")) {
                        z = true;
                        break;
                    }
                    i++;
                }
            } else {
                z = false;
                break;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return z && context.checkSelfPermission("android.permission.CAMERA") != 0;
    }

    /* JADX INFO: renamed from: y */
    public static boolean m12470y(Context context, Uri uri) {
        boolean z;
        if (Build.VERSION.SDK_INT < 23 || context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return false;
        }
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream != null) {
                inputStreamOpenInputStream.close();
            }
            z = false;
        } catch (Exception unused) {
            z = true;
        }
        return z;
    }

    /* JADX INFO: renamed from: z */
    public static final boolean m12471z(View view) {
        if (view != null) {
            Rect rect = new Rect();
            view.getGlobalVisibleRect(rect);
            Rect rect2 = new Rect();
            view.getLocalVisibleRect(rect2);
            if (!Intrinsics2.m13085a(rect, rect2)) {
                return true;
            }
        }
        return false;
    }
}
