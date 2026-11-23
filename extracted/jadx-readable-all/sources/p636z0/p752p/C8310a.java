package p636z0.p752p;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.media.MediaRouter;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.lifecycle.ViewModel;
import androidx.navigation.NavController;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.ref.WeakReference;
import java.util.zip.ZipException;
import mtp.media.karaoke.R;
import p007c.p071d.p078c.p079a.outline;
import p477d1.Lazy3;
import p477d1.p479b0.KClass;
import p477d1.p485u.CoroutineContext;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p500e1.p501a.CoroutineDispatcher;
import p500e1.p501a.CoroutineScope;
import p500e1.p501a.Dispatchers;
import p500e1.p501a.Supervisor;
import p500e1.p501a.p503c2.MainDispatchers;
import p636z0.p752p.p753c.Fragment;
import p636z0.p752p.p753c.FragmentAnim4;
import p636z0.p759s.ViewModel2;
import p636z0.p759s.ViewModelProvider;
import p636z0.p759s.ViewModelProvider2;
import p636z0.p759s.ViewModelStore;
import p636z0.p769x.ZipUtil;

/* JADX INFO: renamed from: z0.p.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8310a {

    /* JADX INFO: renamed from: z0.p.a$a */
    /* JADX INFO: compiled from: FragmentViewModelLazy.kt */
    public static final class a extends Lambda implements InterfaceC6153a<ViewModelProvider2.b> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ Fragment f38258g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment) {
            super(0);
            this.f38258g = fragment;
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public ViewModelProvider2.b mo2c() {
            return this.f38258g.mo126i();
        }
    }

    /* JADX INFO: renamed from: a */
    public static final <VM extends ViewModel> Lazy3<VM> m16436a(Fragment fragment, KClass<VM> kClass, InterfaceC6153a<? extends ViewModelStore> interfaceC6153a, InterfaceC6153a<? extends ViewModelProvider2.b> interfaceC6153a2) {
        Intrinsics2.m13089e(fragment, "$this$createViewModelLazy");
        Intrinsics2.m13089e(kClass, "viewModelClass");
        Intrinsics2.m13089e(interfaceC6153a, "storeProducer");
        return new ViewModelProvider(kClass, interfaceC6153a, new a(fragment));
    }

    /* JADX INFO: renamed from: b */
    public static ZipUtil m16437b(RandomAccessFile randomAccessFile) throws IOException {
        long length = randomAccessFile.length() - 22;
        if (length < 0) {
            StringBuilder sbM1556G = outline.m1556G("File too short to be a zip file: ");
            sbM1556G.append(randomAccessFile.length());
            throw new ZipException(sbM1556G.toString());
        }
        long j2 = length - 65536;
        long j3 = j2 >= 0 ? j2 : 0L;
        int iReverseBytes = Integer.reverseBytes(101010256);
        do {
            randomAccessFile.seek(length);
            if (randomAccessFile.readInt() == iReverseBytes) {
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                ZipUtil zipUtil = new ZipUtil();
                zipUtil.f38983b = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                zipUtil.f38982a = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                return zipUtil;
            }
            length--;
        } while (length >= j3);
        throw new ZipException("End Of Central Directory signature not found");
    }

    /* JADX INFO: renamed from: c */
    public static NavController m16438c(View view) {
        NavController navControllerM16439d = m16439d(view);
        if (navControllerM16439d != null) {
            return navControllerM16439d;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }

    /* JADX INFO: renamed from: d */
    public static NavController m16439d(View view) {
        NavController navController;
        while (view != null) {
            Object tag = view.getTag(R.id.nav_controller_view_tag);
            if (tag instanceof WeakReference) {
                navController = (NavController) ((WeakReference) tag).get();
            } else {
                navController = tag instanceof NavController ? (NavController) tag : null;
            }
            if (navController != null) {
                return navController;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static final CoroutineScope m16440e(ViewModel viewModel) {
        Intrinsics2.m13089e(viewModel, "$this$viewModelScope");
        CoroutineScope coroutineScope = (CoroutineScope) viewModel.m437d("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
        if (coroutineScope != null) {
            return coroutineScope;
        }
        Supervisor supervisor = new Supervisor(null);
        CoroutineDispatcher coroutineDispatcher = Dispatchers.f29769a;
        Object objM439f = viewModel.m439f("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY", new ViewModel2(CoroutineContext.a.C8537a.m13062d(supervisor, MainDispatchers.f29666b.mo13122H0())));
        Intrinsics2.m13088d(objM439f, "setTagIfAbsent(\n        …Main.immediate)\n        )");
        return (CoroutineScope) objM439f;
    }

    /* JADX INFO: renamed from: f */
    public static FragmentAnim4 m16441f(Context context, Fragment fragment, boolean z, boolean z2) {
        int iM16572y;
        Fragment.b bVar = fragment.f38419P;
        boolean z3 = false;
        int i = bVar == null ? 0 : bVar.f38460h;
        if (z2) {
            iM16572y = z ? fragment.m16533J() : fragment.m16535K();
        } else {
            iM16572y = z ? fragment.m16572y() : fragment.m16518B();
        }
        fragment.m16536K0(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.f38415L;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            fragment.f38415L.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = fragment.f38415L;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation animationM16560d0 = fragment.m16560d0();
        if (animationM16560d0 != null) {
            return new FragmentAnim4(animationM16560d0);
        }
        Animator animatorM16561e0 = fragment.m16561e0();
        if (animatorM16561e0 != null) {
            return new FragmentAnim4(animatorM16561e0);
        }
        if (iM16572y == 0 && i != 0) {
            if (i == 4097) {
                iM16572y = z ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
            } else if (i == 4099) {
                iM16572y = z ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit;
            } else if (i != 8194) {
                iM16572y = -1;
            } else {
                iM16572y = z ? R.animator.fragment_close_enter : R.animator.fragment_close_exit;
            }
        }
        if (iM16572y != 0) {
            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(iM16572y));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, iM16572y);
                    if (animationLoadAnimation != null) {
                        return new FragmentAnim4(animationLoadAnimation);
                    }
                    z3 = true;
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            if (!z3) {
                try {
                    Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iM16572y);
                    if (animatorLoadAnimator != null) {
                        return new FragmentAnim4(animatorLoadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (zEquals) {
                        throw e2;
                    }
                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, iM16572y);
                    if (animationLoadAnimation2 != null) {
                        return new FragmentAnim4(animationLoadAnimation2);
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static void m16442g(Object obj, Object obj2) {
        ((MediaRouter.UserRouteInfo) obj).setVolumeCallback((MediaRouter.VolumeCallback) obj2);
    }
}
