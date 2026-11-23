package p555j.p556a.p557a.p606h.p609c.p610a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.format.DateUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertController;
import androidx.lifecycle.ViewModel;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.android.billingclient.api.SkuDetails;
import com.cgfay.media.CainMediaMetadataRetriever;
import com.facebook.stetho.server.http.HttpStatus;
import com.facebook.stetho.websocket.CloseCodes;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.RoundingMode;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Recording;
import mtp.media.karaoke.p628ui.screen.playing.PlayingActivity;
import mtp.media.karaoke.p628ui.screen.profile.ProfileActivity;
import mtp.media.karaoke.p628ui.screen.sing.SingActivity;
import p000.C7400t;
import p000.DialogInterfaceOnClickListenerC6486i;
import p007c.p071d.p078c.p079a.outline;
import p007c.p085g.p086a.Glide;
import p007c.p085g.p086a.RequestBuilder;
import p007c.p085g.p086a.RequestManager;
import p007c.p085g.p086a.p089m.p092t.DiskCacheStrategy;
import p007c.p085g.p086a.p089m.p098v.p099d.CenterCrop;
import p007c.p085g.p086a.p089m.p098v.p099d.CircleCrop;
import p007c.p085g.p086a.p089m.p098v.p099d.DownsampleStrategy;
import p007c.p085g.p086a.p089m.p098v.p099d.FitCenter;
import p007c.p085g.p086a.p089m.p098v.p099d.RoundedCorners;
import p007c.p085g.p086a.p089m.p098v.p101f.DrawableTransitionOptions;
import p007c.p085g.p086a.p105n.RequestManagerRetriever;
import p007c.p085g.p086a.p108q.RequestListener;
import p007c.p085g.p086a.p108q.RequestOptions;
import p007c.p085g.p086a.p108q.p110i.DrawableCrossFadeFactory;
import p007c.p085g.p086a.p111r.ObjectKey;
import p007c.p085g.p086a.p112s.Util4;
import p007c.p190n.p194b.p334e.p356p.MaterialAlertDialogBuilder;
import p007c.p451o.p452a.C5729a;
import p469c1.p470a.p471a.p472a.BlurTransformation;
import p469c1.p470a.p471a.p472a.RoundedCornersTransformation;
import p477d1.Result;
import p477d1.Tuples;
import p477d1.TypeCastException;
import p477d1.Unit;
import p477d1.p478a0._Ranges;
import p477d1.p479b0.KClass;
import p477d1.p481d0.Strings5;
import p477d1.p481d0.StringsJVM;
import p477d1.p482e0.Duration;
import p477d1.p482e0.TimeSource2;
import p477d1.p482e0.TimeSource3;
import p477d1.p483s.Collections2;
import p477d1.p483s.Iterables2;
import p477d1.p485u.Continuation;
import p477d1.p485u.p486i.Intrinsics;
import p477d1.p485u.p486i.IntrinsicsJvm;
import p477d1.p485u.p487j.p488a.ContinuationImpl3;
import p477d1.p485u.p487j.p488a.DebugMetadata;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p500e1.p501a.Dispatchers;
import p509g1.p510j0.Util9;
import p509g1.p510j0.p513f.Task2;
import p509g1.p510j0.p513f.TaskQueue2;
import p509g1.p510j0.p513f.TaskRunner;
import p524h1.AsyncTimeout2;
import p524h1.AsyncTimeout3;
import p524h1.Buffer3;
import p524h1.BufferedSink;
import p524h1.BufferedSource;
import p524h1.JvmOkio;
import p524h1.JvmOkio2;
import p524h1.JvmOkio3;
import p524h1.RealBufferedSink;
import p524h1.RealBufferedSource;
import p524h1.SegmentedByteString;
import p524h1.Sink;
import p524h1.Source;
import p524h1.Timeout2;
import p524h1.p525b0.ByteString2;
import p526i1.p536d.p541b.p542a.ViewModelFactory;
import p526i1.p536d.p541b.p542a.ViewModelFactory2;
import p526i1.p536d.p541b.p542a.ViewModelParameter;
import p526i1.p536d.p543c.Koin;
import p526i1.p536d.p543c.KoinComponent;
import p526i1.p536d.p543c.p544g.KoinContext;
import p526i1.p536d.p543c.p544g.KoinContextHandler;
import p526i1.p536d.p543c.p545h.BeanDefinition;
import p526i1.p536d.p543c.p545h.Properties;
import p526i1.p536d.p543c.p549l.Module;
import p526i1.p536d.p543c.p550m.DefinitionParameters;
import p526i1.p536d.p543c.p551n.Qualifier;
import p526i1.p536d.p543c.p553p.Scope2;
import p526i1.p536d.p554d.KClassExt;
import p555j.p556a.p557a.p558a.p596f.TabData;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p606h.p609c.p611b.SkuEntity;
import p555j.p556a.p557a.p619l.DialogUtils;
import p555j.p556a.p557a.p619l.Extensions;
import p555j.p556a.p557a.p619l.GlideRequest;
import p555j.p556a.p557a.p619l.GlideRequests;
import p636z0.p644b.p645c.AlertDialog;
import p636z0.p654b0.SavedStateRegistryOwner;
import p636z0.p752p.p753c.Fragment;
import p636z0.p759s.Lifecycle3;
import p636z0.p759s.LifecycleObserver;
import p636z0.p759s.LifecycleOwner;
import p636z0.p759s.OnLifecycleEvent;
import p636z0.p759s.ViewModelProvider2;
import p636z0.p759s.ViewModelStore;
import p636z0.p759s.ViewModelStoreOwner;

/* JADX INFO: renamed from: j.a.a.h.c.a.e, reason: use source file name */
/* JADX INFO: compiled from: SkuDao.kt */
/* JADX INFO: loaded from: classes.dex */
public interface SkuDao {

    /* JADX INFO: renamed from: j.a.a.h.c.a.e$a */
    /* JADX INFO: compiled from: SkuDao.kt */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static Dialog f32297a;

        /* JADX INFO: renamed from: b */
        public static Dialog f32298b;

        /* JADX INFO: renamed from: j.a.a.h.c.a.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SkuDao.kt */
        @DebugMetadata(m13068c = "mtp.media.karaoke.data.local.dao.SkuDao$DefaultImpls", m13069f = "SkuDao.kt", m13070l = {19, 23}, m13071m = "insertOrUpdate")
        public static final class C8551a extends ContinuationImpl3 {

            /* JADX INFO: renamed from: i */
            public /* synthetic */ Object f32299i;

            /* JADX INFO: renamed from: j */
            public int f32300j;

            /* JADX INFO: renamed from: k */
            public final /* synthetic */ SkuDao f32301k;

            /* JADX INFO: renamed from: l */
            public Object f32302l;

            /* JADX INFO: renamed from: m */
            public Object f32303m;

            /* JADX INFO: renamed from: n */
            public Object f32304n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8551a(SkuDao skuDao, Continuation continuation) {
                super(continuation);
                this.f32301k = skuDao;
            }

            @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
            /* JADX INFO: renamed from: m */
            public final Object mo6m(Object obj) {
                this.f32299i = obj;
                this.f32300j |= Integer.MIN_VALUE;
                return a.m14112y(null, null, this);
            }
        }

        /* JADX INFO: renamed from: j.a.a.h.c.a.e$a$b */
        /* JADX INFO: compiled from: BindingUtils.kt */
        /* JADX INFO: loaded from: classes2.dex */
        public static final class b implements View.OnClickListener {

            /* JADX INFO: renamed from: f */
            public long f32305f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ InterfaceC6153a f32306g;

            public b(InterfaceC6153a interfaceC6153a) {
                this.f32306g = interfaceC6153a;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (SystemClock.elapsedRealtime() - this.f32305f < CloseCodes.NORMAL_CLOSURE) {
                    return;
                }
                this.f32305f = SystemClock.elapsedRealtime();
                this.f32306g.mo2c();
            }
        }

        /* JADX INFO: renamed from: j.a.a.h.c.a.e$a$c */
        /* JADX INFO: compiled from: Extensions.kt */
        /* JADX INFO: loaded from: classes2.dex */
        public static final class c extends AnimatorListenerAdapter {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ View f32307a;

            public c(View view) {
                this.f32307a = view;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                Intrinsics2.m13089e(animator, "animation");
                super.onAnimationStart(animator);
                this.f32307a.setVisibility(0);
            }
        }

        /* JADX INFO: renamed from: j.a.a.h.c.a.e$a$d */
        /* JADX INFO: compiled from: KotlinExtensions.kt */
        /* JADX INFO: loaded from: classes2.dex */
        public static final class d implements Runnable {

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ Continuation f32308f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ Exception f32309g;

            public d(Continuation continuation, Exception exc) {
                this.f32308f = continuation;
                this.f32309g = exc;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Continuation continuationM13064b = IntrinsicsJvm.m13064b(this.f32308f);
                Exception exc = this.f32309g;
                Result.a aVar = Result.f29493f;
                continuationM13064b.mo13056g(C5729a.m12456k(exc));
            }
        }

        /* JADX INFO: renamed from: j.a.a.h.c.a.e$a$e */
        /* JADX INFO: compiled from: KotlinExtensions.kt */
        /* JADX INFO: loaded from: classes2.dex */
        @DebugMetadata(m13068c = "retrofit2.KotlinExtensions", m13069f = "KotlinExtensions.kt", m13070l = {113}, m13071m = "suspendAndThrow")
        public static final class e extends ContinuationImpl3 {

            /* JADX INFO: renamed from: i */
            public /* synthetic */ Object f32310i;

            /* JADX INFO: renamed from: j */
            public int f32311j;

            /* JADX INFO: renamed from: k */
            public Object f32312k;

            public e(Continuation continuation) {
                super(continuation);
            }

            @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
            /* JADX INFO: renamed from: m */
            public final Object mo6m(Object obj) {
                this.f32310i = obj;
                this.f32311j |= Integer.MIN_VALUE;
                return a.m14080c0(null, this);
            }
        }

        /* JADX INFO: renamed from: A */
        public static final boolean m14049A(AssertionError assertionError) {
            Intrinsics2.m13090f(assertionError, "$this$isAndroidGetsocknameError");
            if (assertionError.getCause() == null) {
                return false;
            }
            String message = assertionError.getMessage();
            return message != null ? Strings5.m13006p(message, "getsockname failed", false, 2) : false;
        }

        /* JADX INFO: renamed from: B */
        public static final boolean m14050B(Buffer3 buffer3) {
            Intrinsics2.m13090f(buffer3, "$this$isProbablyUtf8");
            try {
                Buffer3 buffer4 = new Buffer3();
                buffer3.m13731R(buffer4, 0L, _Ranges.m12966a(buffer3.f30708g, 64L));
                for (int i = 0; i < 16 && !buffer4.mo13759y(); i++) {
                    int iM13762z0 = buffer4.m13762z0();
                    if (Character.isISOControl(iM13762z0) && !Character.isWhitespace(iM13762z0)) {
                        return false;
                    }
                }
                return true;
            } catch (EOFException unused) {
                return false;
            }
        }

        @SuppressLint({"UseCompatLoadingForDrawables"})
        /* JADX INFO: renamed from: C */
        public static final void m14051C(TextView textView, int i) {
            Drawable drawable;
            Intrinsics2.m13089e(textView, "$this$levelBackground");
            if (i >= 0 && 9 >= i) {
                drawable = textView.getResources().getDrawable(R.drawable.ic_level1_9);
            } else if (10 <= i && 19 >= i) {
                drawable = textView.getResources().getDrawable(R.drawable.ic_level10_19);
            } else if (20 <= i && 29 >= i) {
                drawable = textView.getResources().getDrawable(R.drawable.ic_level20_29);
            } else if (30 <= i && 39 >= i) {
                drawable = textView.getResources().getDrawable(R.drawable.ic_level30_39);
            } else if (40 <= i && 49 >= i) {
                drawable = textView.getResources().getDrawable(R.drawable.ic_level40_49);
            } else if (50 <= i && 59 >= i) {
                drawable = textView.getResources().getDrawable(R.drawable.ic_level50_59);
            } else if (60 <= i && 69 >= i) {
                drawable = textView.getResources().getDrawable(R.drawable.ic_level60_69);
            } else if (70 <= i && 79 >= i) {
                drawable = textView.getResources().getDrawable(R.drawable.ic_level70_79);
            } else if (80 <= i && 89 >= i) {
                drawable = textView.getResources().getDrawable(R.drawable.ic_level80_89);
            } else {
                drawable = (90 <= i && 99 >= i) ? textView.getResources().getDrawable(R.drawable.ic_level90_99) : textView.getResources().getDrawable(R.drawable.ic_level90_99);
            }
            textView.setBackground(drawable);
        }

        /* JADX INFO: renamed from: D */
        public static final ArrayList<Recording> m14052D(Recording recording, ArrayList<Recording> arrayList) {
            Intrinsics2.m13089e(recording, "recording");
            ArrayList<Recording> arrayList2 = new ArrayList<>();
            if (arrayList != null) {
                int i = 15;
                if (arrayList.size() > 15) {
                    StringBuilder sbM1556G = outline.m1556G("recordings ");
                    sbM1556G.append(arrayList.size());
                    Intrinsics2.m13089e(sbM1556G.toString(), "message");
                    ArrayList arrayList3 = new ArrayList(Iterables2.m13042g(arrayList, 10));
                    int i2 = 0;
                    int i3 = 0;
                    int i4 = 0;
                    for (Object obj : arrayList) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            Collections2.m13041f();
                            throw null;
                        }
                        if (((Recording) obj).getId() == recording.getId()) {
                            i3 = i4;
                        }
                        arrayList3.add(Unit.f29502a);
                        i4 = i5;
                    }
                    int i6 = i3 - 7;
                    int i7 = i3 + 8;
                    if (i3 <= 0) {
                        i6 = 0;
                    } else {
                        i = i7;
                    }
                    ArrayList arrayList4 = new ArrayList(Iterables2.m13042g(arrayList, 10));
                    for (Object obj2 : arrayList) {
                        int i8 = i2 + 1;
                        if (i2 < 0) {
                            Collections2.m13041f();
                            throw null;
                        }
                        Recording recording2 = (Recording) obj2;
                        if (i6 <= i2 && i >= i2) {
                            arrayList2.add(recording2);
                        }
                        arrayList4.add(Unit.f29502a);
                        i2 = i8;
                    }
                    StringBuilder sbM1556G2 = outline.m1556G("newRecordings ");
                    sbM1556G2.append(arrayList2.size());
                    Intrinsics2.m13089e(sbM1556G2.toString(), "message");
                } else {
                    arrayList2.addAll(arrayList);
                }
            }
            return arrayList2;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX INFO: renamed from: E */
        public static final void m14053E(ImageView imageView, String str, Drawable drawable, Drawable drawable2, RequestListener requestListener, boolean z, boolean z2, boolean z3, int i, boolean z4, RoundedCornersTransformation.a aVar, DiskCacheStrategy diskCacheStrategy, String str2) {
            Intrinsics2.m13089e(imageView, "$this$loadImage");
            if (str == null || StringsJVM.m12990g(str)) {
                imageView.setImageDrawable(drawable);
                return;
            }
            RequestOptions requestOptions = new RequestOptions();
            if (diskCacheStrategy == null) {
                diskCacheStrategy = DiskCacheStrategy.f3276c;
            }
            requestOptions.mo1976g(diskCacheStrategy);
            requestOptions.mo1985r(drawable);
            requestOptions.mo1978j(drawable2);
            if (z) {
                requestOptions.m1970A(DownsampleStrategy.f3554c, new CenterCrop());
            }
            if (z2) {
                requestOptions.m1970A(DownsampleStrategy.f3552a, new FitCenter()).f3723D = true;
            }
            if (z3) {
                requestOptions.m1970A(DownsampleStrategy.f3553b, new CircleCrop());
            }
            if (i > 0 && (aVar == null || requestOptions.mo1972E(new CenterCrop(), new RoundedCornersTransformation(m14088g0(i), 0, aVar)) == null)) {
                requestOptions.mo1972E(new CenterCrop(), new RoundedCorners(m14088g0(i)));
            }
            if (z4) {
                requestOptions.mo1972E(new CenterCrop(), new BlurTransformation(60, 1));
            }
            if (!(str2 == null || StringsJVM.m12990g(str2))) {
                requestOptions.mo1989w(new ObjectKey(str2));
            }
            RequestBuilder requestBuilderMo1653m = ((GlideRequests) Glide.m1627e(imageView.getContext())).mo1653m();
            GlideRequest glideRequest = (GlideRequest) requestBuilderMo1653m;
            glideRequest.f2910K = str;
            glideRequest.f2913N = true;
            GlideRequest glideRequest2 = (GlideRequest) requestBuilderMo1653m;
            DrawableTransitionOptions drawableTransitionOptions = new DrawableTransitionOptions();
            drawableTransitionOptions.f2931f = new DrawableCrossFadeFactory(new DrawableCrossFadeFactory.a().f3793a, false);
            glideRequest2.f2909J = drawableTransitionOptions;
            glideRequest2.f2912M = false;
            if (requestListener != null) {
                if (glideRequest2.f2911L == 0) {
                    glideRequest2.f2911L = new ArrayList();
                }
                glideRequest2.f2911L.add((RequestListener<TranscodeType>) requestListener);
            }
            glideRequest2.m14252S(requestOptions);
            glideRequest2.m1642N(imageView);
        }

        /* JADX INFO: renamed from: F */
        public static /* synthetic */ void m14054F(ImageView imageView, String str, String str2, Drawable drawable, Drawable drawable2, RequestListener requestListener, boolean z, boolean z2, boolean z3, int i, boolean z4, RoundedCornersTransformation.a aVar, DiskCacheStrategy diskCacheStrategy, String str3, int i2) {
            int i3 = i2 & 4;
            int i4 = i2 & 8;
            int i5 = i2 & 16;
            int i6 = i2 & 1024;
            int i7 = i2 & 2048;
            int i8 = i2 & 4096;
            m14053E(imageView, (i2 & 1) != 0 ? null : str, null, null, null, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? false : z2, (i2 & 128) != 0 ? false : z3, (i2 & 256) != 0 ? 0 : i, (i2 & 512) == 0 ? z4 : false, null, null, null);
        }

        /* JADX INFO: renamed from: G */
        public static final void m14055G(Activity activity, boolean z, boolean z2) {
            Configuration configuration;
            Intrinsics2.m13089e(activity, "$this$makeStatusBarTransparent");
            int i = Build.VERSION.SDK_INT;
            Resources resources = activity.getResources();
            Integer numValueOf = (resources == null || (configuration = resources.getConfiguration()) == null) ? null : Integer.valueOf(configuration.uiMode & 48);
            if (numValueOf != null && numValueOf.intValue() == 32) {
                z = true;
            }
            Window window = activity.getWindow();
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            if (i < 23) {
                View decorView = window.getDecorView();
                Intrinsics2.m13088d(decorView, "decorView");
                decorView.setSystemUiVisibility(1024);
            } else if (z) {
                if (i < 26 || !z2) {
                    View decorView2 = window.getDecorView();
                    Intrinsics2.m13088d(decorView2, "decorView");
                    decorView2.setSystemUiVisibility(1024);
                } else {
                    View decorView3 = window.getDecorView();
                    Intrinsics2.m13088d(decorView3, "decorView");
                    decorView3.setSystemUiVisibility(1040);
                }
            } else if (i >= 26) {
                View decorView4 = window.getDecorView();
                Intrinsics2.m13088d(decorView4, "decorView");
                decorView4.setSystemUiVisibility(9232);
            } else {
                View decorView5 = window.getDecorView();
                Intrinsics2.m13088d(decorView5, "decorView");
                decorView5.setSystemUiVisibility(9216);
            }
            window.setStatusBarColor(0);
        }

        /* JADX INFO: renamed from: H */
        public static /* synthetic */ void m14056H(Activity activity, boolean z, boolean z2, int i) {
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = true;
            }
            m14055G(activity, z, z2);
        }

        /* JADX INFO: renamed from: I */
        public static final double m14057I(InterfaceC6153a<Unit> interfaceC6153a) {
            Intrinsics2.m13090f(interfaceC6153a, "code");
            TimeSource2 timeSource2M13019a = TimeSource3.f29485a.m13019a();
            interfaceC6153a.mo2c();
            return Duration.m13017f(timeSource2M13019a.elapsedNow());
        }

        /* JADX INFO: renamed from: J */
        public static final <T> Tuples<T, Double> m14058J(InterfaceC6153a<? extends T> interfaceC6153a) {
            Intrinsics2.m13090f(interfaceC6153a, "code");
            return new Tuples<>(((Scope2.a) interfaceC6153a).mo2c(), Double.valueOf(Duration.m13017f(TimeSource3.f29485a.m13019a().elapsedNow())));
        }

        /* JADX INFO: renamed from: K */
        public static Module m14059K(boolean z, boolean z2, InterfaceC6164l interfaceC6164l, int i) {
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = false;
            }
            Intrinsics2.m13090f(interfaceC6164l, "moduleDeclaration");
            Module module = new Module(z, z2);
            interfaceC6164l.mo3b(module);
            return module;
        }

        /* JADX INFO: renamed from: L */
        public static final void m14060L(TextView textView, int i) {
            String str;
            Intrinsics2.m13089e(textView, "$this$prettyFormat");
            Integer numValueOf = Integer.valueOf(i);
            Intrinsics2.m13089e(numValueOf, "number");
            char[] cArr = {' ', 'k', 'M', 'B', 'T', 'P', 'E'};
            long jLongValue = numValueOf.longValue();
            double d2 = jLongValue;
            int iFloor = (int) Math.floor(Math.log10(d2));
            int i2 = iFloor / 3;
            if (iFloor < 3 || i2 >= 7) {
                str = new DecimalFormat("#,##0").format(jLongValue);
            } else {
                str = new DecimalFormat("#0.0").format(d2 / Math.pow(10.0d, ((double) i2) * ((double) 3))) + cArr[i2];
            }
            textView.setText(str);
        }

        /* JADX INFO: renamed from: M */
        public static final View m14061M(View view) {
            Intrinsics2.m13089e(view, "$this$remove");
            if (view.getVisibility() != 8) {
                view.setVisibility(8);
            }
            return view;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x002c  */
        /* JADX WARN: Code duplicated, block: B:21:? A[RETURN, SYNTHETIC] */
        /* JADX INFO: renamed from: N */
        public static final int m14062N(SegmentedByteString segmentedByteString, int i) {
            int i2;
            Intrinsics2.m13090f(segmentedByteString, "$this$segment");
            int[] iArr = segmentedByteString.f30754l;
            int i3 = i + 1;
            int length = segmentedByteString.f30753k.length;
            Intrinsics2.m13090f(iArr, "$this$binarySearch");
            int i4 = length - 1;
            int i5 = 0;
            while (i5 <= i4) {
                i2 = (i5 + i4) >>> 1;
                int i6 = iArr[i2];
                if (i6 < i3) {
                    i5 = i2 + 1;
                } else {
                    if (i6 <= i3) {
                        if (i2 >= 0) {
                            return i2;
                        }
                        return ~i2;
                    }
                    i4 = i2 - 1;
                }
            }
            i2 = (-i5) - 1;
            if (i2 >= 0) {
                return i2;
            }
            return ~i2;
        }

        /* JADX INFO: renamed from: O */
        public static final void m14063O(BeanDefinition<?> beanDefinition) {
            Intrinsics2.m13090f(beanDefinition, "$this$setIsViewModel");
            Properties properties = beanDefinition.f30905h;
            Boolean bool = Boolean.TRUE;
            Objects.requireNonNull(properties);
            Intrinsics2.m13090f("isViewModel", "key");
            Map<String, Object> map = properties.f30914a;
            if (bool == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Any");
            }
            map.put("isViewModel", bool);
        }

        /* JADX INFO: renamed from: P */
        public static final void m14064P(View view, int i, int i2, int i3, int i4) {
            Intrinsics2.m13089e(view, "$this$setMargin");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(i2, i, i4, i3);
            view.setLayoutParams(marginLayoutParams);
        }

        /* JADX INFO: renamed from: Q */
        public static final void m14065Q(View view, int i) {
            Intrinsics2.m13089e(view, "$this$setMarginBottom");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(0, 0, 0, i);
            view.setLayoutParams(marginLayoutParams);
        }

        /* JADX INFO: renamed from: R */
        public static final void m14066R(View view, int i) {
            Intrinsics2.m13089e(view, "$this$setMarginTop");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(0, i, 0, 0);
            view.setLayoutParams(marginLayoutParams);
        }

        /* JADX INFO: renamed from: S */
        public static final void m14067S(View view, InterfaceC6153a<Unit> interfaceC6153a) {
            Intrinsics2.m13089e(view, "$this$setSingleClick");
            Intrinsics2.m13089e(interfaceC6153a, "execution");
            view.setOnClickListener(new b(interfaceC6153a));
        }

        /* JADX INFO: renamed from: T */
        public static final View m14068T(View view) {
            Intrinsics2.m13089e(view, "$this$show");
            if (view.getVisibility() != 0) {
                view.setVisibility(0);
            }
            return view;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: U */
        public static AlertDialog m14069U(Context context, String str, String str2, String str3, InterfaceC6153a interfaceC6153a, String str4, InterfaceC6153a interfaceC6153a2, boolean z, boolean z2, int i) {
            Dialog dialog;
            final AlertDialog alertDialogCreate = null;
            String str5 = (i & 1) != 0 ? null : str;
            String str6 = (i & 2) != 0 ? null : str2;
            String str7 = (i & 4) != 0 ? null : str3;
            InterfaceC6153a interfaceC6153a3 = (i & 8) != 0 ? null : interfaceC6153a;
            String str8 = (i & 16) != 0 ? null : str4;
            InterfaceC6153a interfaceC6153a4 = (i & 32) != 0 ? null : interfaceC6153a2;
            boolean z3 = (i & 64) != 0 ? false : z;
            boolean z4 = (i & 128) != 0 ? true : z2;
            if (context != 0) {
                MaterialAlertDialogBuilder materialAlertDialogBuilder = new MaterialAlertDialogBuilder(context);
                materialAlertDialogBuilder.m11262f(str5);
                AlertController.C0050b c0050b = materialAlertDialogBuilder.f34424a;
                c0050b.f228f = str6;
                String str9 = str5;
                String str10 = str6;
                String str11 = str7;
                InterfaceC6153a interfaceC6153a5 = interfaceC6153a3;
                String str12 = str8;
                InterfaceC6153a interfaceC6153a6 = interfaceC6153a4;
                boolean z5 = z3;
                DialogInterfaceOnClickListenerC6486i dialogInterfaceOnClickListenerC6486i = new DialogInterfaceOnClickListenerC6486i(0, str9, str10, str11, interfaceC6153a5, str12, interfaceC6153a6, z5);
                c0050b.f229g = str7;
                c0050b.f230h = dialogInterfaceOnClickListenerC6486i;
                DialogInterfaceOnClickListenerC6486i dialogInterfaceOnClickListenerC6486i2 = new DialogInterfaceOnClickListenerC6486i(1, str9, str10, str11, interfaceC6153a5, str12, interfaceC6153a6, z5);
                c0050b.f231i = str8;
                c0050b.f232j = dialogInterfaceOnClickListenerC6486i2;
                c0050b.f233k = z3;
                alertDialogCreate = materialAlertDialogBuilder.create();
                alertDialogCreate.setCanceledOnTouchOutside(z4);
                Dialog dialog2 = f32298b;
                if (dialog2 != null && dialog2.isShowing() && (dialog = f32298b) != null) {
                    dialog.dismiss();
                }
                if (context instanceof LifecycleOwner) {
                    ((LifecycleOwner) context).mo124b().mo16727a(new LifecycleObserver() { // from class: mtp.media.karaoke.utils.DialogUtilsKt$showDialog$2$1
                        @OnLifecycleEvent(Lifecycle3.a.ON_DESTROY)
                        public final void onDestroy() {
                            alertDialogCreate.dismiss();
                            if (SkuDao.a.f32298b == alertDialogCreate) {
                                SkuDao.a.f32298b = null;
                            }
                        }
                    });
                }
                alertDialogCreate.setOnDismissListener(DialogUtils.f33081f);
                f32298b = alertDialogCreate;
                alertDialogCreate.show();
            }
            return alertDialogCreate;
        }

        /* JADX INFO: renamed from: V */
        public static final void m14070V(View view) {
            Intrinsics2.m13089e(view, "$this$showForceKeyboard");
            Object systemService = view.getContext().getSystemService("input_method");
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            view.requestFocus();
            ((InputMethodManager) systemService).toggleSoftInput(1, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: W */
        public static AlertDialog m14071W(Context context, boolean z, boolean z2, int i) {
            Dialog dialog;
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = false;
            }
            MaterialAlertDialogBuilder materialAlertDialogBuilder = new MaterialAlertDialogBuilder(context);
            AlertController.C0050b c0050b = materialAlertDialogBuilder.f34424a;
            c0050b.f239q = null;
            c0050b.f238p = R.layout.layout_loading_dialog;
            final AlertDialog alertDialogCreate = materialAlertDialogBuilder.create();
            alertDialogCreate.setCancelable(z);
            alertDialogCreate.setCanceledOnTouchOutside(z2);
            Window window = alertDialogCreate.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            Dialog dialog2 = f32297a;
            if (dialog2 != null && dialog2.isShowing() && (dialog = f32297a) != null) {
                dialog.dismiss();
            }
            if (context instanceof LifecycleOwner) {
                ((LifecycleOwner) context).mo124b().mo16727a(new LifecycleObserver() { // from class: mtp.media.karaoke.utils.DialogUtilsKt$showLoadingDialog$2$1
                    @OnLifecycleEvent(Lifecycle3.a.ON_DESTROY)
                    public final void onDestroy() {
                        alertDialogCreate.dismiss();
                        if (SkuDao.a.f32297a == alertDialogCreate) {
                            SkuDao.a.f32297a = null;
                        }
                    }
                });
            }
            f32297a = alertDialogCreate;
            alertDialogCreate.show();
            return alertDialogCreate;
        }

        /* JADX INFO: renamed from: X */
        public static final Sink m14072X(OutputStream outputStream) {
            Intrinsics2.m13090f(outputStream, "$this$sink");
            return new JvmOkio2(outputStream, new Timeout2());
        }

        /* JADX INFO: renamed from: Y */
        public static final Sink m14073Y(Socket socket) throws IOException {
            Intrinsics2.m13090f(socket, "$this$sink");
            JvmOkio3 jvmOkio3 = new JvmOkio3(socket);
            OutputStream outputStream = socket.getOutputStream();
            Intrinsics2.m13086b(outputStream, "getOutputStream()");
            JvmOkio2 jvmOkio2 = new JvmOkio2(outputStream, jvmOkio3);
            Intrinsics2.m13090f(jvmOkio2, "sink");
            return new AsyncTimeout2(jvmOkio3, jvmOkio2);
        }

        /* JADX INFO: renamed from: Z */
        public static Sink m14074Z(File file, boolean z, int i, Object obj) throws FileNotFoundException {
            if ((i & 1) != 0) {
                z = false;
            }
            Intrinsics2.m13090f(file, "$this$sink");
            FileOutputStream fileOutputStream = new FileOutputStream(file, z);
            Intrinsics2.m13090f(fileOutputStream, "$this$sink");
            return new JvmOkio2(fileOutputStream, new Timeout2());
        }

        /* JADX INFO: renamed from: a */
        public static final void m14075a(Task2 task2, TaskQueue2 taskQueue2, String str) {
            Objects.requireNonNull(TaskRunner.f30171c);
            Logger logger = TaskRunner.f30170b;
            StringBuilder sb = new StringBuilder();
            sb.append(taskQueue2.f30168f);
            sb.append(' ');
            String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
            Intrinsics2.m13086b(str2, "java.lang.String.format(format, *args)");
            sb.append(str2);
            sb.append(": ");
            sb.append(task2.f30160c);
            logger.fine(sb.toString());
        }

        /* JADX INFO: renamed from: a0 */
        public static final Source m14076a0(Socket socket) throws IOException {
            Intrinsics2.m13090f(socket, "$this$source");
            JvmOkio3 jvmOkio3 = new JvmOkio3(socket);
            InputStream inputStream = socket.getInputStream();
            Intrinsics2.m13086b(inputStream, "getInputStream()");
            JvmOkio jvmOkio = new JvmOkio(inputStream, jvmOkio3);
            Intrinsics2.m13090f(jvmOkio, "source");
            return new AsyncTimeout3(jvmOkio3, jvmOkio);
        }

        /* JADX INFO: renamed from: b */
        public static final Sink m14077b(File file) throws FileNotFoundException {
            Intrinsics2.m13090f(file, "$this$appendingSink");
            FileOutputStream fileOutputStream = new FileOutputStream(file, true);
            Intrinsics2.m13090f(fileOutputStream, "$this$sink");
            return new JvmOkio2(fileOutputStream, new Timeout2());
        }

        /* JADX INFO: renamed from: b0 */
        public static String m14078b0(String str) {
            if (str == null) {
                return null;
            }
            if (str.startsWith("--")) {
                return str.substring(2, str.length());
            }
            return str.startsWith("-") ? str.substring(1, str.length()) : str;
        }

        /* JADX INFO: renamed from: c */
        public static final boolean m14079c(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
            Intrinsics2.m13090f(bArr, "a");
            Intrinsics2.m13090f(bArr2, "b");
            for (int i4 = 0; i4 < i3; i4++) {
                if (bArr[i4 + i] != bArr2[i4 + i2]) {
                    return false;
                }
            }
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX INFO: renamed from: c0 */
        public static final Object m14080c0(Exception exc, Continuation<?> continuation) throws Throwable {
            e eVar;
            if (continuation instanceof e) {
                eVar = (e) continuation;
                int i = eVar.f32311j;
                if ((i & Integer.MIN_VALUE) != 0) {
                    eVar.f32311j = i - Integer.MIN_VALUE;
                } else {
                    eVar = new e(continuation);
                }
            } else {
                eVar = new e(continuation);
            }
            Object obj = eVar.f32310i;
            Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
            int i2 = eVar.f32311j;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C5729a.m12442O(obj);
                return Unit.f29502a;
            }
            C5729a.m12442O(obj);
            eVar.f32312k = exc;
            eVar.f32311j = 1;
            Dispatchers.f29769a.mo13118F0(eVar.getContext(), new d(eVar, exc));
            Intrinsics2.m13089e(eVar, "frame");
            return intrinsics;
        }

        /* JADX INFO: renamed from: d */
        public static final BufferedSink m14081d(Sink sink) {
            Intrinsics2.m13090f(sink, "$this$buffer");
            return new RealBufferedSink(sink);
        }

        /* JADX INFO: renamed from: d0 */
        public static final void m14082d0(TextView textView, String str) {
            Intrinsics2.m13089e(textView, "$this$timeAgo");
            Intrinsics2.m13089e(str, CainMediaMetadataRetriever.METADATA_KEY_DATE);
            Date dateM14093j = m14093j(str, "yyyy-MM-dd HH:mm:ss");
            if (dateM14093j != null) {
                textView.setText(m14106s(dateM14093j));
            } else {
                textView.setText(str);
            }
        }

        /* JADX INFO: renamed from: e */
        public static final BufferedSource m14083e(Source source) {
            Intrinsics2.m13090f(source, "$this$buffer");
            return new RealBufferedSource(source);
        }

        /* JADX INFO: renamed from: e0 */
        public static final String m14084e0(String str) throws UnknownHostException {
            int i;
            Intrinsics2.m13090f(str, "$this$toCanonicalHost");
            int i2 = 0;
            int i3 = -1;
            if (!Strings5.m13006p(str, ":", false, 2)) {
                try {
                    String ascii = IDN.toASCII(str);
                    Intrinsics2.m13086b(ascii, "IDN.toASCII(host)");
                    Locale locale = Locale.US;
                    Intrinsics2.m13086b(locale, "Locale.US");
                    String lowerCase = ascii.toLowerCase(locale);
                    Intrinsics2.m13086b(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    if (lowerCase.length() == 0) {
                        return null;
                    }
                    int length = lowerCase.length();
                    while (i < length) {
                        char cCharAt = lowerCase.charAt(i);
                        i = (cCharAt > 31 && cCharAt < 127 && Strings5.m13011u(" #%/:?@[\\]", cCharAt, 0, false, 6) == -1) ? i + 1 : 0;
                        i2 = 1;
                        break;
                    }
                    if (i2 != 0) {
                        return null;
                    }
                    return lowerCase;
                } catch (IllegalArgumentException unused) {
                    return null;
                }
            }
            InetAddress inetAddressM14097l = (StringsJVM.m12997n(str, "[", false, 2) && StringsJVM.m12988e(str, "]", false, 2)) ? m14097l(str, 1, str.length() - 1) : m14097l(str, 0, str.length());
            if (inetAddressM14097l == null) {
                return null;
            }
            byte[] address = inetAddressM14097l.getAddress();
            if (address.length != 16) {
                if (address.length == 4) {
                    return inetAddressM14097l.getHostAddress();
                }
                throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
            }
            Intrinsics2.m13086b(address, "address");
            int i4 = 0;
            int i5 = 0;
            while (i4 < address.length) {
                int i6 = i4;
                while (i6 < 16 && address[i6] == 0 && address[i6 + 1] == 0) {
                    i6 += 2;
                }
                int i7 = i6 - i4;
                if (i7 > i5 && i7 >= 4) {
                    i3 = i4;
                    i5 = i7;
                }
                i4 = i6 + 2;
            }
            Buffer3 buffer3 = new Buffer3();
            while (i2 < address.length) {
                if (i2 == i3) {
                    buffer3.m13721J0(58);
                    i2 += i5;
                    if (i2 == 16) {
                        buffer3.m13721J0(58);
                    }
                } else {
                    if (i2 > 0) {
                        buffer3.m13721J0(58);
                    }
                    byte b2 = address[i2];
                    byte[] bArr = Util9.f30070a;
                    buffer3.mo13735W(((b2 & 255) << 8) | (address[i2 + 1] & 255));
                    i2 += 2;
                }
            }
            return buffer3.m13755u0();
        }

        /* JADX INFO: renamed from: f */
        public static final void m14085f(long j2, long j3, long j4) {
            if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
                StringBuilder sbM1560K = outline.m1560K("size=", j2, " offset=");
                sbM1560K.append(j3);
                sbM1560K.append(" byteCount=");
                sbM1560K.append(j4);
                throw new ArrayIndexOutOfBoundsException(sbM1560K.toString());
            }
        }

        /* JADX INFO: renamed from: f0 */
        public static final String m14086f0(byte b2) {
            char[] cArr = ByteString2.f30702a;
            return new String(new char[]{cArr[(b2 >> 4) & 15], cArr[b2 & 15]});
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX INFO: renamed from: g */
        public static final TabData m14087g(String str) {
            Intrinsics2.m13089e(str, "id");
            switch (str.hashCode()) {
                case -1309148525:
                    if (str.equals("explore")) {
                        return new TabData("explore", R.string.tab_explore, C7400t.f34110p, null, 8, null);
                    }
                    break;
                case -1049482625:
                    if (str.equals("nearby")) {
                        return new TabData("trending", R.string.title_nearby, C7400t.f34102h, null, 8, null);
                    }
                    break;
                case -309425751:
                    if (str.equals("profile")) {
                        return new TabData("profile", R.string.tab_profile, C7400t.f34113s, null, 8, null);
                    }
                    break;
                case 103501:
                    if (str.equals("hot")) {
                        return new TabData("hot", R.string.title_hot, C7400t.f34116v, null, 8, null);
                    }
                    break;
                case 108960:
                    if (str.equals("new")) {
                        return new TabData("new", R.string.title_newest, C7400t.f34108n, null, 8, null);
                    }
                    break;
                case 115029:
                    if (str.equals("top")) {
                        return new TabData("top", R.string.title_top, C7400t.f34107m, null, 8, null);
                    }
                    break;
                case 3059345:
                    if (str.equals("coin")) {
                        return new TabData("coin", R.string.title_coin, C7400t.f34105k, null, 8, null);
                    }
                    break;
                case 3094784:
                    if (str.equals("duet")) {
                        return new TabData("duet", R.string.title_duet_singer, C7400t.f34115u, null, 8, null);
                    }
                    break;
                case 3138974:
                    if (str.equals("feed")) {
                        return new TabData("feed", R.string.tab_home, C7400t.f34109o, null, 8, null);
                    }
                    break;
                case 3530383:
                    if (str.equals("sing")) {
                        return new TabData("sing", R.string.tab_sing, C7400t.f34111q, null, 8, null);
                    }
                    break;
                case 3540562:
                    if (str.equals("star")) {
                        return new TabData("star", R.string.title_star, C7400t.f34106l, null, 8, null);
                    }
                    break;
                case 765915793:
                    if (str.equals("following")) {
                        return new TabData("new", R.string.title_following, C7400t.f34101g, null, 8, null);
                    }
                    break;
                case 950398559:
                    if (str.equals(CainMediaMetadataRetriever.METADATA_KEY_COMMENT)) {
                        return new TabData(CainMediaMetadataRetriever.METADATA_KEY_COMMENT, R.string.title_comment, C7400t.f34103i, null, 8, null);
                    }
                    break;
                case 989204668:
                    if (str.equals("recommend")) {
                        return new TabData("recommend", R.string.title_recommend, C7400t.f34114t, null, 8, null);
                    }
                    break;
                case 1394955557:
                    if (str.equals("trending")) {
                        return new TabData("trending", R.string.title_trending, C7400t.f34117w, null, 8, null);
                    }
                    break;
                case 1655054676:
                    if (str.equals("diamond")) {
                        return new TabData("diamond", R.string.title_diamond, C7400t.f34104j, null, 8, null);
                    }
                    break;
                case 2097411228:
                    if (str.equals("notificaton")) {
                        return new TabData("notificaton", R.string.tab_notification, C7400t.f34112r, null, 8, null);
                    }
                    break;
            }
            throw new IllegalArgumentException("unknown tab type");
        }

        /* JADX INFO: renamed from: g0 */
        public static final int m14088g0(int i) {
            Resources system = Resources.getSystem();
            Intrinsics2.m13088d(system, "Resources.getSystem()");
            return (int) (i * system.getDisplayMetrics().density);
        }

        /* JADX INFO: renamed from: h */
        public static final void m14089h(SwipeRefreshLayout swipeRefreshLayout, Boolean bool) {
            Intrinsics2.m13089e(swipeRefreshLayout, "$this$customRefreshing");
            swipeRefreshLayout.setRefreshing(Intrinsics2.m13085a(bool, Boolean.TRUE));
        }

        /* JADX INFO: renamed from: h0 */
        public static final String m14090h0(Date date, String str, Locale locale) {
            Intrinsics2.m13089e(date, "$this$toTimeString");
            Intrinsics2.m13089e(str, "format");
            Intrinsics2.m13089e(locale, "locale");
            if (!StringsJVM.m12990g(str)) {
                try {
                    return new SimpleDateFormat(str, locale).format(date);
                } catch (Exception e2) {
                    Intrinsics2.m13089e(e2, "$this$safeLog");
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: i */
        public static final void m14091i(RecyclerView recyclerView, RecyclerView.AbstractC0165r abstractC0165r) {
            Intrinsics2.m13089e(recyclerView, "$this$customScrollListener");
            if (abstractC0165r != null) {
                recyclerView.m607h(abstractC0165r);
            }
        }

        /* JADX INFO: renamed from: i0 */
        public static Unit m14092i0(Context context, int i, int i2, int i3) {
            if ((i3 & 2) != 0) {
                i2 = 1;
            }
            if (context == null) {
                return null;
            }
            Toast.makeText(context, i, i2).show();
            return Unit.f29502a;
        }

        /* JADX INFO: renamed from: j */
        public static final Date m14093j(String str, String str2) {
            Intrinsics2.m13089e(str, "$this$dateInFormat");
            Intrinsics2.m13089e(str2, "format");
            try {
                return new SimpleDateFormat(str2, Locale.getDefault()).parse(str);
            } catch (ParseException e2) {
                e2.printStackTrace();
                return null;
            }
        }

        /* JADX INFO: renamed from: j0 */
        public static Unit m14094j0(Context context, CharSequence charSequence, int i, int i2) {
            if ((i2 & 2) != 0) {
                i = 1;
            }
            Intrinsics2.m13089e(charSequence, "text");
            if (context == null) {
                return null;
            }
            Toast.makeText(context, charSequence, i).show();
            return Unit.f29502a;
        }

        /* JADX INFO: renamed from: k */
        public static final String m14095k(float f) {
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            decimalFormat.setRoundingMode(RoundingMode.CEILING);
            String str = decimalFormat.format(Float.valueOf(f));
            Intrinsics2.m13088d(str, "df.format(this)");
            return str;
        }

        /* JADX INFO: renamed from: k0 */
        public static final void m14096k0(TextView textView, int i) {
            String string;
            Intrinsics2.m13089e(textView, "$this$translateText");
            Intrinsics2.m13089e(textView, "$this$getString");
            try {
                string = textView.getResources().getString(i);
            } catch (Resources.NotFoundException unused) {
                string = null;
            }
            textView.setText(string);
        }

        /* JADX WARN: Code duplicated, block: B:34:0x0060  */
        /* JADX WARN: Code duplicated, block: B:49:0x0085 A[LOOP:2: B:24:0x004a->B:49:0x0085, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:61:0x00a3  */
        /* JADX WARN: Code duplicated, block: B:64:0x00af A[LOOP:1: B:60:0x00a1->B:64:0x00af, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:87:0x00b5 A[EDGE_INSN: B:87:0x00b5->B:65:0x00b5 BREAK  A[LOOP:1: B:60:0x00a1->B:64:0x00af], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:90:0x0096 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:94:0x0080 A[SYNTHETIC] */
        /* JADX INFO: renamed from: l */
        public static final InetAddress m14097l(String str, int i, int i2) throws UnknownHostException {
            boolean z;
            int i3;
            int i4;
            char cCharAt;
            int i5;
            int i6;
            int iM13377q;
            int i7 = 16;
            byte[] bArr = new byte[16];
            int i8 = -1;
            boolean z2 = false;
            int i9 = i;
            int i10 = 0;
            int i11 = -1;
            int i12 = -1;
            while (i9 < i2) {
                if (i10 == i7) {
                    return null;
                }
                int i13 = i9 + 2;
                if (i13 <= i2 && StringsJVM.m12996m(str, "::", i9, z2, 4)) {
                    if (i11 != i8) {
                        return null;
                    }
                    i10 += 2;
                    i11 = i10;
                    if (i13 == i2) {
                        break;
                    }
                    i12 = i13;
                    i9 = i12;
                    i5 = 0;
                    while (i9 < i2) {
                        iM13377q = Util9.m13377q(str.charAt(i9));
                        if (iM13377q == -1) {
                            break;
                            break;
                        }
                        i5 = (i5 << 4) + iM13377q;
                        i9++;
                    }
                    i6 = i9 - i12;
                    if (i6 != 0) {
                    }
                    return null;
                }
                if (i10 != 0) {
                    if (!StringsJVM.m12996m(str, ":", i9, z2, 4)) {
                        if (!StringsJVM.m12996m(str, ".", i9, z2, 4)) {
                            return null;
                        }
                        int i14 = i10 - 2;
                        int i15 = i14;
                        loop2: while (true) {
                            if (i12 >= i2) {
                                if (i15 == i14 + 4) {
                                    z = true;
                                    break;
                                }
                            } else if (i15 != i7) {
                                if (i15 == i14) {
                                    i3 = i12;
                                    i4 = 0;
                                    while (true) {
                                        if (i3 >= i2) {
                                            cCharAt = str.charAt(i3);
                                            if (cCharAt < '0' && cCharAt <= '9') {
                                                if ((i4 != 0 || i12 == i3) && (i4 = ((i4 * 10) + cCharAt) - 48) <= 255) {
                                                    i3++;
                                                }
                                            }
                                        }
                                        if (i3 - i12 == 0) {
                                            bArr[i15] = (byte) i4;
                                            i15++;
                                            i12 = i3;
                                            i7 = 16;
                                        }
                                    }
                                } else if (str.charAt(i12) == '.') {
                                    i12++;
                                    i3 = i12;
                                    i4 = 0;
                                    while (true) {
                                        if (i3 >= i2) {
                                            cCharAt = str.charAt(i3);
                                            if (cCharAt < '0') {
                                            }
                                        }
                                        if (i3 - i12 == 0) {
                                            bArr[i15] = (byte) i4;
                                            i15++;
                                            i12 = i3;
                                            i7 = 16;
                                        }
                                        i3++;
                                    }
                                }
                            }
                            z = false;
                            break loop2;
                        }
                        if (!z) {
                            return null;
                        }
                        i10 += 2;
                        break;
                    }
                    i9++;
                }
                i12 = i9;
                i9 = i12;
                i5 = 0;
                while (i9 < i2) {
                    iM13377q = Util9.m13377q(str.charAt(i9));
                    if (iM13377q == -1) {
                        break;
                    }
                    i5 = (i5 << 4) + iM13377q;
                    i9++;
                }
                i6 = i9 - i12;
                if (i6 != 0 || i6 > 4) {
                    return null;
                }
                int i16 = i10 + 1;
                bArr[i10] = (byte) ((i5 >>> 8) & 255);
                i10 = i16 + 1;
                bArr[i16] = (byte) (i5 & 255);
                i7 = 16;
                i8 = -1;
                z2 = false;
            }
            if (i10 != 16) {
                if (i11 == -1) {
                    return null;
                }
                int i17 = i10 - i11;
                System.arraycopy(bArr, i11, bArr, 16 - i17, i17);
                Arrays.fill(bArr, i11, (16 - i10) + i11, (byte) 0);
            }
            return InetAddress.getByAddress(bArr);
        }

        /* JADX INFO: renamed from: l0 */
        public static final void m14098l0(View view, boolean z) {
            Intrinsics2.m13089e(view, "$this$visible");
            if (z) {
                view.animate().alpha(1.0f).setDuration(300L).setListener(new c(view));
            } else {
                view.setVisibility(0);
            }
        }

        /* JADX INFO: renamed from: m */
        public static final void m14099m() {
            Dialog dialog;
            Dialog dialog2 = f32297a;
            if (dialog2 == null || !dialog2.isShowing() || (dialog = f32297a) == null) {
                return;
            }
            dialog.dismiss();
        }

        /* JADX INFO: renamed from: m0 */
        public static GlideRequests m14100m0(Fragment fragment) {
            RequestManager requestManagerM1951g;
            View view;
            RequestManagerRetriever requestManagerRetrieverM1625c = Glide.m1625c(fragment.m16571x());
            Objects.requireNonNull(requestManagerRetrieverM1625c);
            Objects.requireNonNull(fragment.m16571x(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
            if (Util4.m2052g()) {
                requestManagerM1951g = requestManagerRetrieverM1625c.m1947b(fragment.m16571x().getApplicationContext());
            } else {
                requestManagerM1951g = requestManagerRetrieverM1625c.m1951g(fragment.m16571x(), fragment.m16570w(), fragment, (!fragment.m16550S() || fragment.f38409F || (view = fragment.f38416M) == null || view.getWindowToken() == null || fragment.f38416M.getVisibility() != 0) ? false : true);
            }
            return (GlideRequests) requestManagerM1951g;
        }

        /* JADX INFO: renamed from: n */
        public static final void m14101n(View view, boolean z) {
            Intrinsics2.m13089e(view, "view");
            view.setEnabled(z);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    Intrinsics2.m13088d(childAt, "view.getChildAt(idx)");
                    m14101n(childAt, z);
                }
            }
        }

        /* JADX INFO: renamed from: o */
        public static final String m14102o(long j2) {
            String str;
            if (j2 <= -999500000) {
                str = ((j2 - ((long) 500000000)) / ((long) 1000000000)) + " s ";
            } else if (j2 <= -999500) {
                str = ((j2 - ((long) 500000)) / ((long) 1000000)) + " ms";
            } else if (j2 <= 0) {
                str = ((j2 - ((long) HttpStatus.HTTP_INTERNAL_SERVER_ERROR)) / ((long) CloseCodes.NORMAL_CLOSURE)) + " µs";
            } else if (j2 < 999500) {
                str = ((j2 + ((long) HttpStatus.HTTP_INTERNAL_SERVER_ERROR)) / ((long) CloseCodes.NORMAL_CLOSURE)) + " µs";
            } else if (j2 < 999500000) {
                str = ((j2 + ((long) 500000)) / ((long) 1000000)) + " ms";
            } else {
                str = ((j2 + ((long) 500000000)) / ((long) 1000000000)) + " s ";
            }
            String str2 = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
            Intrinsics2.m13086b(str2, "java.lang.String.format(format, *args)");
            return str2;
        }

        /* JADX INFO: renamed from: p */
        public static final int m14103p(Activity activity) {
            Intrinsics2.m13089e(activity, "activity");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            WindowManager windowManager = activity.getWindowManager();
            Intrinsics2.m13088d(windowManager, "activity.windowManager");
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics.heightPixels;
        }

        /* JADX INFO: renamed from: q */
        public static final int m14104q(Activity activity) {
            Intrinsics2.m13089e(activity, "activity");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            WindowManager windowManager = activity.getWindowManager();
            Intrinsics2.m13088d(windowManager, "activity.windowManager");
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics.widthPixels;
        }

        /* JADX INFO: renamed from: r */
        public static final int m14105r(Context context) {
            Intrinsics2.m13089e(context, "$this$getStatusBarHeight");
            int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                return context.getResources().getDimensionPixelSize(identifier);
            }
            return 0;
        }

        /* JADX INFO: renamed from: s */
        public static final CharSequence m14106s(Date date) {
            Intrinsics2.m13089e(date, "$this$getTimeAgo");
            CharSequence relativeTimeSpanString = DateUtils.getRelativeTimeSpanString(date.getTime(), System.currentTimeMillis(), 1000L);
            Intrinsics2.m13088d(relativeTimeSpanString, "DateUtils.getRelativeTim…teUtils.SECOND_IN_MILLIS)");
            return relativeTimeSpanString;
        }

        /* JADX INFO: renamed from: t */
        public static final <T extends ViewModel> T m14107t(ViewModelStoreOwner viewModelStoreOwner, KClass<T> kClass, Qualifier qualifier, InterfaceC6153a<DefinitionParameters> interfaceC6153a) {
            Koin koinMo13844e;
            ViewModelProvider2.b viewModelFactory;
            Intrinsics2.m13090f(viewModelStoreOwner, "$this$getViewModel");
            Intrinsics2.m13090f(kClass, "clazz");
            ComponentCallbacks componentCallbacks = (ComponentCallbacks) viewModelStoreOwner;
            Intrinsics2.m13090f(componentCallbacks, "$this$getKoin");
            if (componentCallbacks instanceof KoinComponent) {
                koinMo13844e = ((KoinComponent) componentCallbacks).mo13844e();
            } else {
                KoinContext koinContext = KoinContextHandler.f30896a;
                if (koinContext == null) {
                    throw new IllegalStateException("No Koin Context configured. Please use startKoin or koinApplication DSL. ".toString());
                }
                koinMo13844e = koinContext.get();
            }
            Intrinsics2.m13090f(koinMo13844e, "$this$getViewModel");
            Intrinsics2.m13090f(viewModelStoreOwner, "owner");
            Intrinsics2.m13090f(kClass, "clazz");
            Scope2 scope2 = koinMo13844e.f30886a.f30939c;
            if (scope2 == null) {
                throw new IllegalStateException("No root scoped initialized".toString());
            }
            Intrinsics2.m13090f(scope2, "$this$getViewModel");
            Intrinsics2.m13090f(viewModelStoreOwner, "owner");
            Intrinsics2.m13090f(kClass, "clazz");
            ViewModelStore viewModelStoreMo128o = viewModelStoreOwner.mo128o();
            Intrinsics2.m13086b(viewModelStoreMo128o, "owner.viewModelStore");
            ViewModelParameter viewModelParameter = new ViewModelParameter(kClass, qualifier, interfaceC6153a, null, viewModelStoreMo128o, null);
            Intrinsics2.m13090f(scope2, "$this$getViewModel");
            Intrinsics2.m13090f(viewModelParameter, "viewModelParameters");
            Intrinsics2.m13090f(scope2, "$this$createViewModelProvider");
            Intrinsics2.m13090f(viewModelParameter, "viewModelParameters");
            ViewModelStore viewModelStore = viewModelParameter.f30884e;
            if (viewModelParameter.f30883d != null) {
                Intrinsics2.m13090f(scope2, "$this$stateViewModelFactory");
                Intrinsics2.m13090f(viewModelParameter, "vmParams");
                SavedStateRegistryOwner savedStateRegistryOwner = viewModelParameter.f30885f;
                if (savedStateRegistryOwner == null) {
                    throw new IllegalStateException("Can't create SavedStateViewModelFactory without a proper stateRegistryOwner".toString());
                }
                viewModelFactory = new ViewModelFactory2(scope2, viewModelParameter, savedStateRegistryOwner, savedStateRegistryOwner, viewModelParameter.f30883d);
            } else {
                Intrinsics2.m13090f(scope2, "$this$defaultViewModelFactory");
                Intrinsics2.m13090f(viewModelParameter, "parameters");
                viewModelFactory = new ViewModelFactory(scope2, viewModelParameter);
            }
            ViewModelProvider2 viewModelProvider2 = new ViewModelProvider2(viewModelStore, viewModelFactory);
            Intrinsics2.m13090f(viewModelProvider2, "$this$resolveInstance");
            Intrinsics2.m13090f(viewModelParameter, "viewModelParameters");
            Class<T> clsM12464s = C5729a.m12464s(viewModelParameter.f30880a);
            Qualifier qualifier2 = viewModelParameter.f30881b;
            Intrinsics2.m13090f(viewModelProvider2, "$this$get");
            Intrinsics2.m13090f(viewModelParameter, "viewModelParameters");
            Intrinsics2.m13090f(clsM12464s, "javaClass");
            if (viewModelParameter.f30881b != null) {
                T t = (T) viewModelProvider2.m16723b(String.valueOf(qualifier2), clsM12464s);
                Intrinsics2.m13086b(t, "get(qualifier.toString(), javaClass)");
                return t;
            }
            T t2 = (T) viewModelProvider2.m16722a(clsM12464s);
            Intrinsics2.m13086b(t2, "get(javaClass)");
            return t2;
        }

        /* JADX INFO: renamed from: u */
        public static final Intent m14108u(Activity activity, String str, int i, Integer num) {
            Intrinsics2.m13089e(activity, "$this$goToScreen");
            if (Intrinsics2.m13085a(str, "like") || Intrinsics2.m13085a(str, CainMediaMetadataRetriever.METADATA_KEY_COMMENT) || Intrinsics2.m13085a(str, "receive_gift") || Intrinsics2.m13085a(str, "share") || Intrinsics2.m13085a(str, "duet_joined") || Intrinsics2.m13085a(str, "duet_send_invite") || Intrinsics2.m13085a(str, "duet_recording_reaction") || Intrinsics2.m13085a(str, "like_duet") || Intrinsics2.m13085a(str, "comment_duet") || Intrinsics2.m13085a(str, "recording_generic")) {
                return PlayingActivity.C7291e.m14396b(PlayingActivity.f33644w, activity, i, null, null, null, null, 60);
            }
            if (Intrinsics2.m13085a(str, "like_comment") || Intrinsics2.m13085a(str, "comment_reply")) {
                if (num != null) {
                    return PlayingActivity.C7291e.m14396b(PlayingActivity.f33644w, activity, num.intValue(), null, null, null, null, 60);
                }
            } else {
                if (Intrinsics2.m13085a(str, "user_following") || Intrinsics2.m13085a(str, "user_view_profile")) {
                    return ProfileActivity.f33786u.m14415a(activity, i);
                }
                if (Intrinsics2.m13085a(str, "song_generic")) {
                    return SingActivity.C7351e.m14457b(SingActivity.f33896w, activity, i, 0, 0, 12);
                }
                Intrinsics2.m13085a(str, "profile_generic");
            }
            return null;
        }

        /* JADX INFO: renamed from: v */
        public static final View m14109v(View view) {
            Intrinsics2.m13089e(view, "$this$hide");
            if (view.getVisibility() != 4) {
                view.setVisibility(4);
            }
            return view;
        }

        /* JADX INFO: renamed from: w */
        public static final boolean m14110w(View view) {
            Intrinsics2.m13089e(view, "$this$hideKeyboard");
            try {
                Object systemService = view.getContext().getSystemService("input_method");
                if (systemService != null) {
                    return ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            } catch (RuntimeException unused) {
                return false;
            }
        }

        /* JADX INFO: renamed from: x */
        public static final String m14111x(KClass<?> kClass, Qualifier qualifier) {
            Intrinsics2.m13090f(kClass, "clazz");
            if ((qualifier != null ? qualifier.getValue() : null) == null) {
                return KClassExt.m13867a(kClass);
            }
            return KClassExt.m13867a(kClass) + "::" + qualifier.getValue();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0019  */
        /* JADX INFO: renamed from: y */
        public static Object m14112y(SkuDao skuDao, SkuDetails skuDetails, Continuation<? super SkuDetails> continuation) throws Throwable {
            C8551a c8551a;
            SkuDetails skuDetails2;
            SkuDao skuDao2;
            Boolean boolValueOf;
            SkuDetails skuDetails3 = skuDetails;
            if (continuation instanceof C8551a) {
                c8551a = (C8551a) continuation;
                int i = c8551a.f32300j;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c8551a.f32300j = i - Integer.MIN_VALUE;
                } else {
                    c8551a = new C8551a(skuDao, continuation);
                }
            } else {
                c8551a = new C8551a(skuDao, continuation);
            }
            Object objM14114d = c8551a.f32299i;
            Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
            int i2 = c8551a.f32300j;
            if (i2 == 0) {
                C5729a.m12442O(objM14114d);
                String strM12555a = skuDetails.m12555a();
                Intrinsics2.m13088d(strM12555a, "sku");
                c8551a.f32302l = skuDao;
                c8551a.f32303m = skuDetails3;
                c8551a.f32304n = skuDetails3;
                c8551a.f32300j = 1;
                SkuDao_Impl skuDao_Impl = (SkuDao_Impl) skuDao;
                objM14114d = skuDao_Impl.m14114d(strM12555a, c8551a);
                if (objM14114d == intrinsics) {
                    return intrinsics;
                }
                skuDetails2 = skuDetails3;
                skuDao2 = skuDao_Impl;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SkuDetails skuDetails4 = (SkuDetails) c8551a.f32302l;
                    C5729a.m12442O(objM14114d);
                    return skuDetails4;
                }
                skuDetails2 = (SkuDetails) c8551a.f32304n;
                skuDetails3 = (SkuDetails) c8551a.f32303m;
                SkuDao skuDao3 = (SkuDao) c8551a.f32302l;
                C5729a.m12442O(objM14114d);
                skuDao2 = skuDao3;
            }
            SkuEntity skuEntity = (SkuEntity) objM14114d;
            boolean zBooleanValue = (skuEntity == null || (boolValueOf = Boolean.valueOf(skuEntity.f32357l)) == null) ? true : boolValueOf.booleanValue();
            String string = skuDetails2.toString();
            Intrinsics2.m13088d(string, "toString()");
            String strSubstring = string.substring(12);
            Intrinsics2.m13088d(strSubstring, "(this as java.lang.String).substring(startIndex)");
            String strM12555a2 = skuDetails2.m12555a();
            Intrinsics2.m13088d(strM12555a2, "sku");
            SkuEntity skuEntity2 = new SkuEntity(strM12555a2, skuDetails2.m12556b(), skuDetails2.f28133b.optString("price"), skuDetails2.f28133b.optString(CainMediaMetadataRetriever.METADATA_KEY_TITLE), skuDetails2.f28133b.optString(CainMediaMetadataRetriever.METADATA_KEY_DESCRIPTION), strSubstring, zBooleanValue);
            c8551a.f32302l = skuDetails3;
            c8551a.f32303m = null;
            c8551a.f32304n = null;
            c8551a.f32300j = 2;
            return skuDao2.mo14047b(skuEntity2, c8551a) == intrinsics ? intrinsics : skuDetails3;
        }

        /* JADX INFO: renamed from: z */
        public static final void m14113z(View view, boolean z) {
            Intrinsics2.m13089e(view, "$this$invisible");
            try {
                if (z) {
                    view.animate().alpha(0.0f).setDuration(300L).setListener(new Extensions(view, 4));
                } else {
                    view.setVisibility(4);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    Object mo14046a(Continuation<? super List<SkuEntity>> continuation);

    /* JADX INFO: renamed from: b */
    Object mo14047b(SkuEntity skuEntity, Continuation<? super Unit> continuation);

    /* JADX INFO: renamed from: c */
    Object mo14048c(SkuDetails skuDetails, Continuation<? super SkuDetails> continuation);
}
