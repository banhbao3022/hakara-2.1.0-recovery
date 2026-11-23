package p555j.p556a.p557a.p619l;

import java.util.concurrent.atomic.AtomicBoolean;
import p477d1.p493x.p495c.Intrinsics2;
import p636z0.p759s.LifecycleOwner;
import p636z0.p759s.MutableLiveData;
import p636z0.p759s.Observer;

/* JADX INFO: renamed from: j.a.a.l.o, reason: use source file name */
/* JADX INFO: compiled from: SingleLiveEvent.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class SingleLiveEvent<T> extends MutableLiveData<T> {

    /* JADX INFO: renamed from: l */
    public final AtomicBoolean f33092l = new AtomicBoolean(false);

    /* JADX INFO: renamed from: j.a.a.l.o$a */
    /* JADX INFO: compiled from: SingleLiveEvent.kt */
    public static final class a<T> implements Observer<T> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Observer f33094b;

        public a(Observer observer) {
            this.f33094b = observer;
        }

        @Override // p636z0.p759s.Observer
        /* JADX INFO: renamed from: d */
        public final void mo410d(T t) {
            if (SingleLiveEvent.this.f33092l.compareAndSet(true, false)) {
                this.f33094b.mo410d(t);
            }
        }
    }

    @Override // androidx.lifecycle.LiveData
    /* JADX INFO: renamed from: e */
    public void mo422e(LifecycleOwner lifecycleOwner, Observer<? super T> observer) {
        Intrinsics2.m13089e(lifecycleOwner, "owner");
        Intrinsics2.m13089e(observer, "observer");
        super.mo422e(lifecycleOwner, new a(observer));
    }

    @Override // p636z0.p759s.MutableLiveData, androidx.lifecycle.LiveData
    /* JADX INFO: renamed from: j */
    public void mo427j(T t) {
        this.f33092l.set(true);
        super.mo427j(t);
    }
}
