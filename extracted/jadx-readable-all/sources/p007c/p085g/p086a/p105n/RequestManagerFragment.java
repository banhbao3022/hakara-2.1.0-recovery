package p007c.p085g.p086a.p105n;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import p007c.p085g.p086a.Glide;
import p007c.p085g.p086a.RequestManager;

/* JADX INFO: renamed from: c.g.a.n.k, reason: use source file name */
/* JADX INFO: compiled from: RequestManagerFragment.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class RequestManagerFragment extends Fragment {

    /* JADX INFO: renamed from: f */
    public final ActivityFragmentLifecycle f3678f;

    /* JADX INFO: renamed from: g */
    public final RequestManagerTreeNode f3679g;

    /* JADX INFO: renamed from: h */
    public final Set<RequestManagerFragment> f3680h;

    /* JADX INFO: renamed from: i */
    public RequestManager f3681i;

    /* JADX INFO: renamed from: j */
    public RequestManagerFragment f3682j;

    /* JADX INFO: renamed from: k */
    public Fragment f3683k;

    /* JADX INFO: renamed from: c.g.a.n.k$a */
    /* JADX INFO: compiled from: RequestManagerFragment.java */
    public class a implements RequestManagerTreeNode {
        public a() {
        }

        public String toString() {
            return super.toString() + "{fragment=" + RequestManagerFragment.this + "}";
        }
    }

    public RequestManagerFragment() {
        ActivityFragmentLifecycle activityFragmentLifecycle = new ActivityFragmentLifecycle();
        this.f3679g = new a();
        this.f3680h = new HashSet();
        this.f3678f = activityFragmentLifecycle;
    }

    /* JADX INFO: renamed from: a */
    public final void m1943a(Activity activity) {
        m1944b();
        RequestManagerRetriever requestManagerRetriever = Glide.m1624b(activity).f2861m;
        Objects.requireNonNull(requestManagerRetriever);
        RequestManagerFragment requestManagerFragmentM1949d = requestManagerRetriever.m1949d(activity.getFragmentManager(), null, RequestManagerRetriever.m1946f(activity));
        this.f3682j = requestManagerFragmentM1949d;
        if (equals(requestManagerFragmentM1949d)) {
            return;
        }
        this.f3682j.f3680h.add(this);
    }

    /* JADX INFO: renamed from: b */
    public final void m1944b() {
        RequestManagerFragment requestManagerFragment = this.f3682j;
        if (requestManagerFragment != null) {
            requestManagerFragment.f3680h.remove(this);
            this.f3682j = null;
        }
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            m1943a(activity);
        } catch (IllegalStateException e) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f3678f.m1939c();
        m1944b();
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        m1944b();
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f3678f.m1940d();
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.f3678f.m1941e();
    }

    @Override // android.app.Fragment
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f3683k;
        }
        sb.append(parentFragment);
        sb.append("}");
        return sb.toString();
    }
}
