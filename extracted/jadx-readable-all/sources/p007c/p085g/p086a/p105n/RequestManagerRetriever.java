package p007c.p085g.p086a.p105n;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import p007c.p085g.p086a.Glide;
import p007c.p085g.p086a.RequestManager;
import p007c.p085g.p086a.p112s.Util4;
import p636z0.p691g.ArrayMap;
import p636z0.p752p.p753c.BackStackRecord;
import p636z0.p752p.p753c.FragmentActivity;

/* JADX INFO: renamed from: c.g.a.n.l, reason: use source file name */
/* JADX INFO: compiled from: RequestManagerRetriever.java */
/* JADX INFO: loaded from: classes.dex */
public class RequestManagerRetriever implements Handler.Callback {

    /* JADX INFO: renamed from: f */
    public static final b f3685f = new a();

    /* JADX INFO: renamed from: g */
    public volatile RequestManager f3686g;

    /* JADX INFO: renamed from: h */
    public final Map<FragmentManager, RequestManagerFragment> f3687h = new HashMap();

    /* JADX INFO: renamed from: i */
    public final Map<p636z0.p752p.p753c.FragmentManager, SupportRequestManagerFragment> f3688i = new HashMap();

    /* JADX INFO: renamed from: j */
    public final Handler f3689j;

    /* JADX INFO: renamed from: k */
    public final b f3690k;

    /* JADX INFO: renamed from: c.g.a.n.l$a */
    /* JADX INFO: compiled from: RequestManagerRetriever.java */
    public class a implements b {
        @Override // p007c.p085g.p086a.p105n.RequestManagerRetriever.b
        /* JADX INFO: renamed from: a */
        public RequestManager mo1622a(Glide glide, Lifecycle2 lifecycle2, RequestManagerTreeNode requestManagerTreeNode, Context context) {
            return new RequestManager(glide, lifecycle2, requestManagerTreeNode, context);
        }
    }

    /* JADX INFO: renamed from: c.g.a.n.l$b */
    /* JADX INFO: compiled from: RequestManagerRetriever.java */
    public interface b {
        /* JADX INFO: renamed from: a */
        RequestManager mo1622a(Glide glide, Lifecycle2 lifecycle2, RequestManagerTreeNode requestManagerTreeNode, Context context);
    }

    public RequestManagerRetriever(b bVar) {
        new ArrayMap();
        new ArrayMap();
        new Bundle();
        this.f3690k = bVar == null ? f3685f : bVar;
        this.f3689j = new Handler(Looper.getMainLooper(), this);
    }

    /* JADX INFO: renamed from: a */
    public static Activity m1945a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m1945a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m1946f(Context context) {
        Activity activityM1945a = m1945a(context);
        return activityM1945a == null || !activityM1945a.isFinishing();
    }

    /* JADX INFO: renamed from: b */
    public RequestManager m1947b(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (Util4.m2053h() && !(context instanceof Application)) {
            if (context instanceof FragmentActivity) {
                return m1948c((FragmentActivity) context);
            }
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (Util4.m2052g()) {
                    return m1947b(activity.getApplicationContext());
                }
                if (activity.isDestroyed()) {
                    throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
                }
                RequestManagerFragment requestManagerFragmentM1949d = m1949d(activity.getFragmentManager(), null, m1946f(activity));
                RequestManager requestManager = requestManagerFragmentM1949d.f3681i;
                if (requestManager != null) {
                    return requestManager;
                }
                RequestManager requestManagerMo1622a = this.f3690k.mo1622a(Glide.m1624b(activity), requestManagerFragmentM1949d.f3678f, requestManagerFragmentM1949d.f3679g, activity);
                requestManagerFragmentM1949d.f3681i = requestManagerMo1622a;
                return requestManagerMo1622a;
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return m1947b(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.f3686g == null) {
            synchronized (this) {
                if (this.f3686g == null) {
                    this.f3686g = this.f3690k.mo1622a(Glide.m1624b(context.getApplicationContext()), new ApplicationLifecycle(), new EmptyRequestManagerTreeNode(), context.getApplicationContext());
                }
            }
        }
        return this.f3686g;
    }

    /* JADX INFO: renamed from: c */
    public RequestManager m1948c(FragmentActivity fragmentActivity) {
        if (Util4.m2052g()) {
            return m1947b(fragmentActivity.getApplicationContext());
        }
        if (fragmentActivity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        return m1951g(fragmentActivity, fragmentActivity.m16577C(), null, m1946f(fragmentActivity));
    }

    /* JADX INFO: renamed from: d */
    public final RequestManagerFragment m1949d(FragmentManager fragmentManager, Fragment fragment, boolean z) {
        RequestManagerFragment requestManagerFragment = (RequestManagerFragment) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (requestManagerFragment == null && (requestManagerFragment = this.f3687h.get(fragmentManager)) == null) {
            requestManagerFragment = new RequestManagerFragment();
            requestManagerFragment.f3683k = fragment;
            if (fragment != null && fragment.getActivity() != null) {
                requestManagerFragment.m1943a(fragment.getActivity());
            }
            if (z) {
                requestManagerFragment.f3678f.m1940d();
            }
            this.f3687h.put(fragmentManager, requestManagerFragment);
            fragmentManager.beginTransaction().add(requestManagerFragment, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f3689j.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return requestManagerFragment;
    }

    /* JADX INFO: renamed from: e */
    public final SupportRequestManagerFragment m1950e(p636z0.p752p.p753c.FragmentManager fragmentManager, p636z0.p752p.p753c.Fragment fragment, boolean z) {
        SupportRequestManagerFragment supportRequestManagerFragment = (SupportRequestManagerFragment) fragmentManager.m16656I("com.bumptech.glide.manager");
        if (supportRequestManagerFragment == null && (supportRequestManagerFragment = this.f3688i.get(fragmentManager)) == null) {
            supportRequestManagerFragment = new SupportRequestManagerFragment();
            supportRequestManagerFragment.f3699h0 = fragment;
            if (fragment != null && fragment.m16571x() != null) {
                p636z0.p752p.p753c.Fragment fragment2 = fragment;
                while (true) {
                    p636z0.p752p.p753c.Fragment fragment3 = fragment2.f38405B;
                    if (fragment3 == null) {
                        break;
                    }
                    fragment2 = fragment3;
                }
                p636z0.p752p.p753c.FragmentManager fragmentManager2 = fragment2.f38450y;
                if (fragmentManager2 != null) {
                    supportRequestManagerFragment.m1954X0(fragment.m16571x(), fragmentManager2);
                }
            }
            if (z) {
                supportRequestManagerFragment.f3694c0.m1940d();
            }
            this.f3688i.put(fragmentManager, supportRequestManagerFragment);
            BackStackRecord backStackRecord = new BackStackRecord(fragmentManager);
            backStackRecord.mo16448g(0, supportRequestManagerFragment, "com.bumptech.glide.manager", 1);
            backStackRecord.m16454o();
            this.f3689j.obtainMessage(2, fragmentManager).sendToTarget();
        }
        return supportRequestManagerFragment;
    }

    /* JADX INFO: renamed from: g */
    public final RequestManager m1951g(Context context, p636z0.p752p.p753c.FragmentManager fragmentManager, p636z0.p752p.p753c.Fragment fragment, boolean z) {
        SupportRequestManagerFragment supportRequestManagerFragmentM1950e = m1950e(fragmentManager, fragment, z);
        RequestManager requestManager = supportRequestManagerFragmentM1950e.f3698g0;
        if (requestManager != null) {
            return requestManager;
        }
        RequestManager requestManagerMo1622a = this.f3690k.mo1622a(Glide.m1624b(context), supportRequestManagerFragmentM1950e.f3694c0, supportRequestManagerFragmentM1950e.f3695d0, context);
        supportRequestManagerFragmentM1950e.f3698g0 = requestManagerMo1622a;
        return requestManagerMo1622a;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Object obj;
        Object objRemove;
        Object obj2;
        int i = message.what;
        Object obj3 = null;
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                z = false;
                obj2 = null;
            } else {
                obj = (p636z0.p752p.p753c.FragmentManager) message.obj;
                objRemove = this.f3688i.remove(obj);
            }
            if (z && obj3 == null && Log.isLoggable("RMRetriever", 5)) {
                Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
            }
            return z;
        }
        obj = (FragmentManager) message.obj;
        objRemove = this.f3687h.remove(obj);
        Object obj4 = obj;
        obj3 = objRemove;
        obj2 = obj4;
        if (z) {
            Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
        }
        return z;
    }
}
