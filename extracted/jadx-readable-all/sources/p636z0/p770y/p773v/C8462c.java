package p636z0.p770y.p773v;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.annotation.SuppressLint;
import android.database.Cursor;
import android.graphics.Path;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.util.Property;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import p007c.p056c.p057a.LottieComposition;
import p007c.p056c.p057a.p059b0.p060j.AnimatableColorValue;
import p007c.p056c.p057a.p059b0.p060j.AnimatableFloatValue;
import p007c.p056c.p057a.p059b0.p060j.AnimatableIntegerValue;
import p007c.p056c.p057a.p059b0.p060j.AnimatablePointValue;
import p007c.p056c.p057a.p064d0.ColorParser;
import p007c.p056c.p057a.p064d0.FloatParser;
import p007c.p056c.p057a.p064d0.IntegerParser;
import p007c.p056c.p057a.p064d0.KeyframesParser;
import p007c.p056c.p057a.p064d0.PointFParser;
import p007c.p056c.p057a.p064d0.ValueParser;
import p007c.p056c.p057a.p064d0.p065h0.JsonReader;
import p007c.p056c.p057a.p066e0.Utils;
import p007c.p056c.p057a.p067f0.Keyframe;
import p007c.p071d.p078c.p079a.outline;
import p007c.p085g.p086a.p089m.ImageHeaderParserUtils4;
import p007c.p085g.p086a.p089m.ImageHeaderParserUtils5;
import p007c.p085g.p086a.p089m.p092t.p093c0.ArrayPool;
import p007c.p085g.p086a.p089m.p098v.p099d.RecyclableBufferedInputStream;
import p007c.p451o.p452a.C5729a;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p477d1.p485u.ContinuationInterceptor;
import p477d1.p485u.CoroutineContext;
import p477d1.p485u.p486i.Intrinsics;
import p477d1.p485u.p486i.IntrinsicsJvm;
import p477d1.p485u.p487j.p488a.ContinuationImpl3;
import p477d1.p485u.p487j.p488a.ContinuationImpl5;
import p477d1.p485u.p487j.p488a.DebugMetadata;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p500e1.p501a.CancellableContinuationImpl4;
import p500e1.p501a.CompletableJob;
import p500e1.p501a.CoroutineDispatcher;
import p500e1.p501a.CoroutineScope;
import p500e1.p501a.Job;
import p500e1.p501a.p503c2.ThreadContext2;
import p636z0.p641a0.RoomDatabase;
import p636z0.p641a0.RoomDatabase2;
import p636z0.p641a0.RoomDatabase3;
import p636z0.p641a0.RoomDatabase4;
import p636z0.p709j0.BackoffPolicy;
import p636z0.p709j0.ContentUriTriggers;
import p636z0.p709j0.NetworkType;
import p636z0.p709j0.WorkInfo;
import p636z0.p774z.p775b.OrientationHelper3;

/* JADX INFO: renamed from: z0.y.v.c */
/* JADX INFO: loaded from: classes.dex */
public final class C8462c {

    /* JADX INFO: renamed from: a */
    public static long f39106a;

    /* JADX INFO: renamed from: b */
    public static Method f39107b;

    /* JADX INFO: renamed from: z0.y.v.c$a */
    /* JADX INFO: compiled from: RoomDatabase.kt */
    @DebugMetadata(m13068c = "androidx.room.RoomDatabaseKt", m13069f = "RoomDatabase.kt", m13070l = {99}, m13071m = "createTransactionContext")
    public static final class a extends ContinuationImpl3 {

        /* JADX INFO: renamed from: i */
        public /* synthetic */ Object f39108i;

        /* JADX INFO: renamed from: j */
        public int f39109j;

        /* JADX INFO: renamed from: k */
        public Object f39110k;

        /* JADX INFO: renamed from: l */
        public Object f39111l;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: m */
        public final Object mo6m(Object obj) {
            this.f39108i = obj;
            this.f39109j |= Integer.MIN_VALUE;
            return C8462c.m16939f(null, this);
        }
    }

    /* JADX INFO: renamed from: z0.y.v.c$b */
    /* JADX INFO: compiled from: RoomDatabase.kt */
    public static final class b extends Lambda implements InterfaceC6164l<Throwable, Unit> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ CompletableJob f39112g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CompletableJob completableJob) {
            super(1);
            this.f39112g = completableJob;
        }

        @Override // p477d1.p493x.p494b.InterfaceC6164l
        /* JADX INFO: renamed from: b */
        public Unit mo3b(Throwable th) {
            C5729a.m12453h(this.f39112g, null, 1, null);
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: z0.y.v.c$c */
    /* JADX INFO: compiled from: RoomDatabase.kt */
    @DebugMetadata(m13068c = "androidx.room.RoomDatabaseKt", m13069f = "RoomDatabase.kt", m13070l = {50, 51}, m13071m = "withTransaction")
    public static final class c extends ContinuationImpl3 {

        /* JADX INFO: renamed from: i */
        public /* synthetic */ Object f39113i;

        /* JADX INFO: renamed from: j */
        public int f39114j;

        /* JADX INFO: renamed from: k */
        public Object f39115k;

        /* JADX INFO: renamed from: l */
        public Object f39116l;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: m */
        public final Object mo6m(Object obj) {
            this.f39113i = obj;
            this.f39114j |= Integer.MIN_VALUE;
            return C8462c.m16933B(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: z0.y.v.c$d */
    /* JADX INFO: compiled from: RoomDatabase.kt */
    @DebugMetadata(m13068c = "androidx.room.RoomDatabaseKt$withTransaction$2", m13069f = "RoomDatabase.kt", m13070l = {58}, m13071m = "invokeSuspend")
    public static final class d<R> extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super R>, Object> {

        /* JADX INFO: renamed from: j */
        public /* synthetic */ Object f39117j;

        /* JADX INFO: renamed from: k */
        public int f39118k;

        /* JADX INFO: renamed from: l */
        public final /* synthetic */ RoomDatabase f39119l;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ InterfaceC6164l f39120m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(RoomDatabase roomDatabase, InterfaceC6164l interfaceC6164l, Continuation continuation) {
            super(2, continuation);
            this.f39119l = roomDatabase;
            this.f39120m = interfaceC6164l;
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: a */
        public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
            Intrinsics2.m13089e(continuation, "completion");
            d dVar = new d(this.f39119l, this.f39120m, continuation);
            dVar.f39117j = obj;
            return dVar;
        }

        @Override // p477d1.p493x.p494b.InterfaceC6168p
        /* JADX INFO: renamed from: l */
        public final Object mo5l(CoroutineScope coroutineScope, Object obj) {
            Continuation continuation = (Continuation) obj;
            Intrinsics2.m13089e(continuation, "completion");
            d dVar = new d(this.f39119l, this.f39120m, continuation);
            dVar.f39117j = coroutineScope;
            return dVar.mo6m(Unit.f29502a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [d1.u.i.a, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: m */
        public final Object mo6m(Object obj) throws Throwable {
            Throwable th;
            RoomDatabase4 roomDatabase4;
            RoomDatabase4 roomDatabase5 = Intrinsics.COROUTINE_SUSPENDED;
            int i = this.f39118k;
            try {
                if (i == 0) {
                    C5729a.m12442O(obj);
                    CoroutineContext.a aVar = ((CoroutineScope) this.f39117j).mo417h().get(RoomDatabase4.f34368f);
                    Intrinsics2.m13087c(aVar);
                    RoomDatabase4 roomDatabase6 = (RoomDatabase4) aVar;
                    roomDatabase6.f34369g.incrementAndGet();
                    try {
                        this.f39119l.m14529c();
                        try {
                            InterfaceC6164l interfaceC6164l = this.f39120m;
                            this.f39117j = roomDatabase6;
                            this.f39118k = 1;
                            Object objMo3b = interfaceC6164l.mo3b(this);
                            if (objMo3b == roomDatabase5) {
                                return roomDatabase5;
                            }
                            roomDatabase4 = roomDatabase6;
                            obj = objMo3b;
                        } catch (Throwable th2) {
                            th = th2;
                            this.f39119l.m14530f();
                            throw th;
                        }
                    } catch (Throwable th3) {
                        roomDatabase5 = roomDatabase6;
                        th = th3;
                        roomDatabase5.m14562b();
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    roomDatabase4 = (RoomDatabase4) this.f39117j;
                    try {
                        C5729a.m12442O(obj);
                    } catch (Throwable th4) {
                        th = th4;
                        this.f39119l.m14530f();
                        throw th;
                    }
                }
                this.f39119l.m14537n();
                this.f39119l.m14530f();
                roomDatabase4.m14562b();
                return obj;
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    /* JADX INFO: renamed from: z0.y.v.c$e */
    /* JADX INFO: compiled from: ImageHeaderParserUtils.java */
    public class e implements ImageHeaderParserUtils5 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InputStream f39121a;

        public e(InputStream inputStream) {
            this.f39121a = inputStream;
        }

        @Override // p007c.p085g.p086a.p089m.ImageHeaderParserUtils5
        /* JADX INFO: renamed from: a */
        public ImageHeaderParser.ImageType mo1701a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.mo1884b(this.f39121a);
            } finally {
                this.f39121a.reset();
            }
        }
    }

    /* JADX INFO: renamed from: z0.y.v.c$f */
    /* JADX INFO: compiled from: ImageHeaderParserUtils.java */
    public class f implements ImageHeaderParserUtils4 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InputStream f39122a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ArrayPool f39123b;

        public f(InputStream inputStream, ArrayPool arrayPool) {
            this.f39122a = inputStream;
            this.f39123b = arrayPool;
        }

        @Override // p007c.p085g.p086a.p089m.ImageHeaderParserUtils4
        /* JADX INFO: renamed from: a */
        public int mo1702a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.mo1885c(this.f39122a, this.f39123b);
            } finally {
                this.f39122a.reset();
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public static int m16932A(WorkInfo workInfo) {
        int iOrdinal = workInfo.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3) {
                    i = 4;
                    if (iOrdinal != 4) {
                        if (iOrdinal == 5) {
                            return 5;
                        }
                        throw new IllegalArgumentException("Could not convert " + workInfo + " to int");
                    }
                }
            }
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0077 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0078 A[PHI: r7
  0x0078: PHI (r7v11 java.lang.Object) = (r7v8 java.lang.Object), (r7v1 java.lang.Object) binds: [B:26:0x0075, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: B */
    public static final <R> Object m16933B(RoomDatabase roomDatabase, InterfaceC6164l<? super Continuation<? super R>, ? extends Object> interfaceC6164l, Continuation<? super R> continuation) throws Throwable {
        c cVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i = cVar.f39114j;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar.f39114j = i - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objM16939f = cVar.f39113i;
        Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
        int i2 = cVar.f39114j;
        if (i2 != 0) {
            if (i2 == 1) {
                interfaceC6164l = (InterfaceC6164l) cVar.f39116l;
                roomDatabase = (RoomDatabase) cVar.f39115k;
                C5729a.m12442O(objM16939f);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C5729a.m12442O(objM16939f);
            }
            return objM16939f;
        }
        C5729a.m12442O(objM16939f);
        CoroutineContext coroutineContext = cVar.f29550h;
        Intrinsics2.m13087c(coroutineContext);
        RoomDatabase4 roomDatabase4 = (RoomDatabase4) coroutineContext.get(RoomDatabase4.f34368f);
        if (roomDatabase4 == null || (coroutineContext = roomDatabase4.f34371i) == null) {
            cVar.f39115k = roomDatabase;
            cVar.f39116l = interfaceC6164l;
            cVar.f39114j = 1;
            objM16939f = m16939f(roomDatabase, cVar);
            if (objM16939f == intrinsics) {
                return intrinsics;
            }
        }
        d dVar = new d(roomDatabase, interfaceC6164l, null);
        cVar.f39115k = null;
        cVar.f39116l = null;
        cVar.f39114j = 2;
        objM16939f = C5729a.m12445R(coroutineContext, dVar, cVar);
        if (objM16939f == intrinsics) {
            return intrinsics;
        }
        return objM16939f;
        CoroutineContext coroutineContext2 = (CoroutineContext) objM16939f;
        d dVar2 = new d(roomDatabase, interfaceC6164l, null);
        cVar.f39115k = null;
        cVar.f39116l = null;
        cVar.f39114j = 2;
        objM16939f = C5729a.m12445R(coroutineContext2, dVar2, cVar);
        if (objM16939f == intrinsics) {
            return intrinsics;
        }
        return objM16939f;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static ContentUriTriggers m16934a(byte[] bArr) throws Throwable {
        ObjectInputStream objectInputStream;
        Throwable th;
        IOException e2;
        ContentUriTriggers contentUriTriggers = new ContentUriTriggers();
        if (bArr == null) {
            return contentUriTriggers;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    try {
                        for (int i = objectInputStream.readInt(); i > 0; i--) {
                            contentUriTriggers.f37255a.add(new ContentUriTriggers.a(Uri.parse(objectInputStream.readUTF()), objectInputStream.readBoolean()));
                        }
                        try {
                            objectInputStream.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                        byteArrayInputStream.close();
                    } catch (IOException e4) {
                        e2 = e4;
                        e2.printStackTrace();
                        if (objectInputStream != null) {
                            try {
                                objectInputStream.close();
                            } catch (IOException e5) {
                                e5.printStackTrace();
                            }
                        }
                        byteArrayInputStream.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (objectInputStream != null) {
                        try {
                            objectInputStream.close();
                        } catch (IOException e6) {
                            e6.printStackTrace();
                        }
                    }
                    try {
                        byteArrayInputStream.close();
                        throw th;
                    } catch (IOException e7) {
                        e7.printStackTrace();
                        throw th;
                    }
                }
            } catch (IOException e8) {
                e8.printStackTrace();
            }
        } catch (IOException e9) {
            objectInputStream = null;
            e2 = e9;
        } catch (Throwable th3) {
            objectInputStream = null;
            th = th3;
            if (objectInputStream != null) {
                objectInputStream.close();
            }
            byteArrayInputStream.close();
            throw th;
        }
        return contentUriTriggers;
    }

    /* JADX INFO: renamed from: b */
    public static void m16935b(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m16936c(RecyclerView.C0172y c0172y, OrientationHelper3 orientationHelper3, View view, View view2, RecyclerView.AbstractC0160m abstractC0160m, boolean z) {
        if (abstractC0160m.m764y() == 0 || c0172y.m809b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(abstractC0160m.m735R(view) - abstractC0160m.m735R(view2)) + 1;
        }
        return Math.min(orientationHelper3.mo17073l(), orientationHelper3.mo17063b(view2) - orientationHelper3.mo17066e(view));
    }

    /* JADX INFO: renamed from: d */
    public static int m16937d(RecyclerView.C0172y c0172y, OrientationHelper3 orientationHelper3, View view, View view2, RecyclerView.AbstractC0160m abstractC0160m, boolean z, boolean z2) {
        if (abstractC0160m.m764y() == 0 || c0172y.m809b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (c0172y.m809b() - Math.max(abstractC0160m.m735R(view), abstractC0160m.m735R(view2))) - 1) : Math.max(0, Math.min(abstractC0160m.m735R(view), abstractC0160m.m735R(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(orientationHelper3.mo17063b(view2) - orientationHelper3.mo17066e(view)) / (Math.abs(abstractC0160m.m735R(view) - abstractC0160m.m735R(view2)) + 1))) + (orientationHelper3.mo17072k() - orientationHelper3.mo17066e(view)));
        }
        return iMax;
    }

    /* JADX INFO: renamed from: e */
    public static int m16938e(RecyclerView.C0172y c0172y, OrientationHelper3 orientationHelper3, View view, View view2, RecyclerView.AbstractC0160m abstractC0160m, boolean z) {
        if (abstractC0160m.m764y() == 0 || c0172y.m809b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return c0172y.m809b();
        }
        return (int) (((orientationHelper3.mo17063b(view2) - orientationHelper3.mo17066e(view)) / (Math.abs(abstractC0160m.m735R(view) - abstractC0160m.m735R(view2)) + 1)) * c0172y.m809b());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: f */
    public static final Object m16939f(RoomDatabase roomDatabase, Continuation<? super CoroutineContext> continuation) throws Throwable {
        a aVar;
        RoomDatabase roomDatabase2;
        CompletableJob completableJob;
        Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.f39109j;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.f39109j = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f39108i;
        int i2 = aVar.f39109j;
        if (i2 == 0) {
            C5729a.m12442O(obj);
            CompletableJob completableJobM12447b = C5729a.m12447b(null, 1, null);
            CoroutineContext coroutineContext = aVar.f29550h;
            Intrinsics2.m13087c(coroutineContext);
            Job job = (Job) coroutineContext.get(Job.f29633e);
            if (job != null) {
                job.mo13128b0(new b(completableJobM12447b));
            }
            Executor executor = roomDatabase.f34305c;
            Intrinsics2.m13088d(executor, "transactionExecutor");
            aVar.f39110k = roomDatabase;
            aVar.f39111l = completableJobM12447b;
            aVar.f39109j = 1;
            CancellableContinuationImpl4 cancellableContinuationImpl4 = new CancellableContinuationImpl4(IntrinsicsJvm.m13064b(aVar), 1);
            cancellableContinuationImpl4.m13271x();
            cancellableContinuationImpl4.mo13254i(new RoomDatabase2(executor, completableJobM12447b));
            try {
                executor.execute(new RoomDatabase3(cancellableContinuationImpl4, executor, completableJobM12447b));
            } catch (RejectedExecutionException e2) {
                cancellableContinuationImpl4.m13264n(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e2));
            }
            Object objM13268s = cancellableContinuationImpl4.m13268s();
            if (objM13268s == intrinsics) {
                Intrinsics2.m13089e(aVar, "frame");
            }
            if (objM13268s == intrinsics) {
                return intrinsics;
            }
            roomDatabase2 = roomDatabase;
            completableJob = completableJobM12447b;
            obj = objM13268s;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            completableJob = (CompletableJob) aVar.f39111l;
            roomDatabase2 = (RoomDatabase) aVar.f39110k;
            C5729a.m12442O(obj);
        }
        ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) obj;
        RoomDatabase4 roomDatabase4 = new RoomDatabase4(completableJob, continuationInterceptor);
        ThreadLocal<Integer> threadLocal = roomDatabase2.f34313k;
        Intrinsics2.m13088d(threadLocal, "suspendingTransactionId");
        return continuationInterceptor.plus(roomDatabase4).plus(new ThreadContext2(new Integer(System.identityHashCode(completableJob)), threadLocal));
    }

    /* JADX INFO: renamed from: g */
    public static int m16940g(Cursor cursor, String str) {
        String string;
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0) {
            columnIndex = cursor.getColumnIndex("`" + str + "`");
            if (columnIndex < 0) {
                if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
                    String[] columnNames = cursor.getColumnNames();
                    String strM1599u = outline.m1599u(".", str);
                    String strM1600v = outline.m1600v(".", str, "`");
                    int i = 0;
                    while (true) {
                        if (i < columnNames.length) {
                            String str2 = columnNames[i];
                            if (str2.length() < str.length() + 2 || !(str2.endsWith(strM1599u) || (str2.charAt(0) == '`' && str2.endsWith(strM1600v)))) {
                                i++;
                            } else {
                                columnIndex = i;
                            }
                        } else {
                            columnIndex = -1;
                        }
                    }
                } else {
                    columnIndex = -1;
                }
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            string = Arrays.toString(cursor.getColumnNames());
        } catch (Exception e2) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e2);
            string = "";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + string);
    }

    /* JADX INFO: renamed from: h */
    public static int m16941h(List<ImageHeaderParser> list, InputStream inputStream, ArrayPool arrayPool) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, arrayPool);
        }
        inputStream.mark(5242880);
        return m16942i(list, new f(inputStream, arrayPool));
    }

    /* JADX INFO: renamed from: i */
    public static int m16942i(List<ImageHeaderParser> list, ImageHeaderParserUtils4 imageHeaderParserUtils4) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int iMo1702a = imageHeaderParserUtils4.mo1702a(list.get(i));
            if (iMo1702a != -1) {
                return iMo1702a;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: j */
    public static final CoroutineDispatcher m16943j(RoomDatabase roomDatabase) {
        Intrinsics2.m13089e(roomDatabase, "$this$queryDispatcher");
        Map<String, Object> map = roomDatabase.f34314l;
        Intrinsics2.m13088d(map, "backingFieldMap");
        Object objM12459n = map.get("QueryDispatcher");
        if (objM12459n == null) {
            Executor executor = roomDatabase.f34304b;
            Intrinsics2.m13088d(executor, "queryExecutor");
            objM12459n = C5729a.m12459n(executor);
            map.put("QueryDispatcher", objM12459n);
        }
        return (CoroutineDispatcher) objM12459n;
    }

    /* JADX INFO: renamed from: k */
    public static final CoroutineDispatcher m16944k(RoomDatabase roomDatabase) {
        Intrinsics2.m13089e(roomDatabase, "$this$transactionDispatcher");
        Map<String, Object> map = roomDatabase.f34314l;
        Intrinsics2.m13088d(map, "backingFieldMap");
        Object objM12459n = map.get("TransactionDispatcher");
        if (objM12459n == null) {
            Executor executor = roomDatabase.f34305c;
            Intrinsics2.m13088d(executor, "transactionExecutor");
            objM12459n = C5729a.m12459n(executor);
            map.put("TransactionDispatcher", objM12459n);
        }
        return (CoroutineDispatcher) objM12459n;
    }

    /* JADX INFO: renamed from: l */
    public static ImageHeaderParser.ImageType m16945l(List<ImageHeaderParser> list, InputStream inputStream, ArrayPool arrayPool) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, arrayPool);
        }
        inputStream.mark(5242880);
        return m16946m(list, new e(inputStream));
    }

    /* JADX INFO: renamed from: m */
    public static ImageHeaderParser.ImageType m16946m(List<ImageHeaderParser> list, ImageHeaderParserUtils5 imageHeaderParserUtils5) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser.ImageType imageTypeMo1701a = imageHeaderParserUtils5.mo1701a(list.get(i));
            if (imageTypeMo1701a != ImageHeaderParser.ImageType.UNKNOWN) {
                return imageTypeMo1701a;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    /* JADX INFO: renamed from: n */
    public static BackoffPolicy m16947n(int i) {
        if (i == 0) {
            return BackoffPolicy.EXPONENTIAL;
        }
        if (i == 1) {
            return BackoffPolicy.LINEAR;
        }
        throw new IllegalArgumentException(outline.m1592n("Could not convert ", i, " to BackoffPolicy"));
    }

    /* JADX INFO: renamed from: o */
    public static NetworkType m16948o(int i) {
        if (i == 0) {
            return NetworkType.NOT_REQUIRED;
        }
        if (i == 1) {
            return NetworkType.CONNECTED;
        }
        if (i == 2) {
            return NetworkType.UNMETERED;
        }
        if (i == 3) {
            return NetworkType.NOT_ROAMING;
        }
        if (i == 4) {
            return NetworkType.METERED;
        }
        throw new IllegalArgumentException(outline.m1592n("Could not convert ", i, " to NetworkType"));
    }

    /* JADX INFO: renamed from: p */
    public static WorkInfo m16949p(int i) {
        if (i == 0) {
            return WorkInfo.ENQUEUED;
        }
        if (i == 1) {
            return WorkInfo.RUNNING;
        }
        if (i == 2) {
            return WorkInfo.SUCCEEDED;
        }
        if (i == 3) {
            return WorkInfo.FAILED;
        }
        if (i == 4) {
            return WorkInfo.BLOCKED;
        }
        if (i == 5) {
            return WorkInfo.CANCELLED;
        }
        throw new IllegalArgumentException(outline.m1592n("Could not convert ", i, " to State"));
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: q */
    public static boolean m16950q() {
        try {
            if (f39107b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f39107b == null) {
                f39106a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f39107b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f39107b.invoke(null, Long.valueOf(f39106a))).booleanValue();
        } catch (Exception e2) {
            if (!(e2 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e2);
                return false;
            }
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    /* JADX INFO: renamed from: r */
    public static boolean m16951r(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* JADX INFO: renamed from: s */
    public static boolean m16952s(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384;
    }

    /* JADX INFO: renamed from: t */
    public static <T> ObjectAnimator m16953t(T t, Property<T, PointF> property, Path path) {
        return ObjectAnimator.ofObject(t, property, (TypeConverter) null, path);
    }

    /* JADX INFO: renamed from: u */
    public static <T> List<Keyframe<T>> m16954u(JsonReader jsonReader, LottieComposition lottieComposition, ValueParser<T> valueParser) throws IOException {
        return KeyframesParser.m1410a(jsonReader, lottieComposition, 1.0f, valueParser);
    }

    /* JADX INFO: renamed from: v */
    public static AnimatableColorValue m16955v(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        return new AnimatableColorValue(m16954u(jsonReader, lottieComposition, ColorParser.f2253a));
    }

    /* JADX INFO: renamed from: w */
    public static AnimatableFloatValue m16956w(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        return m16957x(jsonReader, lottieComposition, true);
    }

    /* JADX INFO: renamed from: x */
    public static AnimatableFloatValue m16957x(JsonReader jsonReader, LottieComposition lottieComposition, boolean z) throws IOException {
        return new AnimatableFloatValue(KeyframesParser.m1410a(jsonReader, lottieComposition, z ? Utils.m1439c() : 1.0f, FloatParser.f2260a));
    }

    /* JADX INFO: renamed from: y */
    public static AnimatableIntegerValue m16958y(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        return new AnimatableIntegerValue(m16954u(jsonReader, lottieComposition, IntegerParser.f2299a));
    }

    /* JADX INFO: renamed from: z */
    public static AnimatablePointValue m16959z(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        return new AnimatablePointValue(KeyframesParser.m1410a(jsonReader, lottieComposition, Utils.m1439c(), PointFParser.f2314a));
    }
}
