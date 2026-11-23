package p007c.p165l.p178k0;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p007c.p071d.p078c.p079a.outline;
import p007c.p165l.CallbackManager;
import p007c.p165l.FacebookCallback;
import p007c.p165l.FacebookException;
import p007c.p165l.FacebookSdk;
import p007c.p165l.LoggingBehavior;
import p636z0.p752p.p753c.Fragment;

/* JADX INFO: renamed from: c.l.k0.i, reason: use source file name */
/* JADX INFO: compiled from: FacebookDialogBase.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class FacebookDialogBase<CONTENT, RESULT> {

    /* JADX INFO: renamed from: a */
    public static final Object f4948a = new Object();

    /* JADX INFO: renamed from: b */
    public final Activity f4949b;

    /* JADX INFO: renamed from: c */
    public final FragmentWrapper f4950c;

    /* JADX INFO: renamed from: d */
    public List<FacebookDialogBase<CONTENT, RESULT>.a> f4951d;

    /* JADX INFO: renamed from: e */
    public int f4952e;

    /* JADX INFO: renamed from: c.l.k0.i$a */
    /* JADX INFO: compiled from: FacebookDialogBase.java */
    public abstract class a {
        public a(FacebookDialogBase facebookDialogBase) {
        }

        /* JADX INFO: renamed from: a */
        public abstract boolean mo2501a(CONTENT content, boolean z);

        /* JADX INFO: renamed from: b */
        public abstract AppCall mo2502b(CONTENT content);
    }

    public FacebookDialogBase(Activity activity, int i) {
        Validate.m2477f(activity, "activity");
        this.f4949b = activity;
        this.f4950c = null;
        this.f4952e = i;
    }

    /* JADX INFO: renamed from: a */
    public abstract AppCall mo2495a();

    /* JADX INFO: renamed from: b */
    public Activity m2496b() {
        Activity activity = this.f4949b;
        if (activity != null) {
            return activity;
        }
        FragmentWrapper fragmentWrapper = this.f4950c;
        if (fragmentWrapper == null) {
            return null;
        }
        Fragment fragment = fragmentWrapper.f5035a;
        return fragment != null ? fragment.m16562f() : fragmentWrapper.f5036b.getActivity();
    }

    /* JADX INFO: renamed from: c */
    public abstract List<FacebookDialogBase<CONTENT, RESULT>.a> mo2497c();

    /* JADX INFO: renamed from: d */
    public final void m2498d(CallbackManager callbackManager, FacebookCallback<RESULT> facebookCallback, int i) {
        int i2 = FacebookSdk.f5361j;
        if (i >= i2 && i < i2 + 100) {
            throw new IllegalArgumentException(outline.m1592n("Request code ", i, " cannot be within the range reserved by the Facebook SDK."));
        }
        this.f4952e = i;
        if (!(callbackManager instanceof CallbackManagerImpl)) {
            throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
        }
        mo2499e((CallbackManagerImpl) callbackManager, facebookCallback);
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo2499e(CallbackManagerImpl callbackManagerImpl, FacebookCallback<RESULT> facebookCallback);

    /* JADX INFO: renamed from: f */
    public void m2500f(CONTENT content) {
        AppCall appCallMo2495a;
        if (this.f4951d == null) {
            this.f4951d = mo2497c();
        }
        Iterator<FacebookDialogBase<CONTENT, RESULT>.a> it = this.f4951d.iterator();
        while (true) {
            if (!it.hasNext()) {
                appCallMo2495a = null;
                break;
            }
            FacebookDialogBase<CONTENT, RESULT>.a next = it.next();
            if (next.mo2501a(content, true)) {
                try {
                    appCallMo2495a = next.mo2502b(content);
                    break;
                } catch (FacebookException e) {
                    AppCall appCallMo2495a2 = mo2495a();
                    DialogPresenter.m2483d(appCallMo2495a2, e);
                    appCallMo2495a = appCallMo2495a2;
                }
            }
        }
        if (appCallMo2495a == null) {
            appCallMo2495a = mo2495a();
            DialogPresenter.m2483d(appCallMo2495a, new FacebookException("Unable to show the provided content via the web or the installed version of the Facebook app. Some dialogs are only supported starting API 14."));
        }
        if (appCallMo2495a == null) {
            Log.e("FacebookDialog", "No code path should ever result in a null appCall");
            HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
            return;
        }
        FragmentWrapper fragmentWrapper = this.f4950c;
        if (fragmentWrapper == null) {
            this.f4949b.startActivityForResult(appCallMo2495a.f4875c, appCallMo2495a.f4876d);
            AppCall.m2414a(appCallMo2495a);
            return;
        }
        Intent intent = appCallMo2495a.f4875c;
        int i = appCallMo2495a.f4876d;
        Fragment fragment = fragmentWrapper.f5035a;
        if (fragment != null) {
            fragment.startActivityForResult(intent, i);
        } else {
            fragmentWrapper.f5036b.startActivityForResult(intent, i);
        }
        AppCall.m2414a(appCallMo2495a);
    }

    public FacebookDialogBase(FragmentWrapper fragmentWrapper, int i) {
        Activity activity;
        Validate.m2477f(fragmentWrapper, "fragmentWrapper");
        this.f4950c = fragmentWrapper;
        this.f4949b = null;
        this.f4952e = i;
        Fragment fragment = fragmentWrapper.f5035a;
        if (fragment != null) {
            activity = fragment.m16562f();
        } else {
            activity = fragmentWrapper.f5036b.getActivity();
        }
        if (activity == null) {
            throw new IllegalArgumentException("Cannot use a fragment that is not attached to an activity");
        }
    }
}
