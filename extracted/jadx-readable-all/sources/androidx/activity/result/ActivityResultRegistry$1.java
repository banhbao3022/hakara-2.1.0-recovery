package androidx.activity.result;

import androidx.lifecycle.LifecycleEventObserver;
import p636z0.p637a.p639e.ActivityResult;
import p636z0.p637a.p639e.ActivityResultCallback;
import p636z0.p637a.p639e.ActivityResultRegistry;
import p636z0.p637a.p639e.p640g.ActivityResultContract;
import p636z0.p759s.Lifecycle3;
import p636z0.p759s.LifecycleOwner;

/* JADX INFO: loaded from: classes.dex */
public class ActivityResultRegistry$1 implements LifecycleEventObserver {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f171f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ActivityResultCallback f172g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ActivityResultContract f173h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ ActivityResultRegistry f174i;

    public ActivityResultRegistry$1(ActivityResultRegistry activityResultRegistry, String str, ActivityResultCallback activityResultCallback, ActivityResultContract activityResultContract) {
        this.f174i = activityResultRegistry;
        this.f171f = str;
        this.f172g = activityResultCallback;
        this.f173h = activityResultContract;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    /* JADX INFO: renamed from: c */
    public void mo130c(LifecycleOwner lifecycleOwner, Lifecycle3.a aVar) {
        if (!Lifecycle3.a.ON_START.equals(aVar)) {
            if (Lifecycle3.a.ON_STOP.equals(aVar)) {
                this.f174i.f34178f.remove(this.f171f);
                return;
            } else {
                if (Lifecycle3.a.ON_DESTROY.equals(aVar)) {
                    this.f174i.m14497d(this.f171f);
                    return;
                }
                return;
            }
        }
        this.f174i.f34178f.put(this.f171f, new ActivityResultRegistry.b<>(this.f172g, this.f173h));
        if (this.f174i.f34179g.containsKey(this.f171f)) {
            Object obj = this.f174i.f34179g.get(this.f171f);
            this.f174i.f34179g.remove(this.f171f);
            this.f172g.mo14492a(obj);
        }
        ActivityResult activityResult = (ActivityResult) this.f174i.f34180h.getParcelable(this.f171f);
        if (activityResult != null) {
            this.f174i.f34180h.remove(this.f171f);
            this.f172g.mo14492a(this.f173h.mo14500c(activityResult.f34171f, activityResult.f34172g));
        }
    }
}
