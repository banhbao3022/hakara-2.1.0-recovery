package p555j.p556a.p557a;

import java.util.ArrayList;
import mtp.media.karaoke.data.model.Simple5;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p558a.p592b.BaseViewModel;
import p555j.p556a.p557a.p606h.p614e.UserRepository;
import p636z0.p759s.MutableLiveData;

/* JADX INFO: renamed from: j.a.a.e, reason: use source file name */
/* JADX INFO: compiled from: MainViewModel.kt */
/* JADX INFO: loaded from: classes.dex */
public final class MainViewModel3 extends BaseViewModel {

    /* JADX INFO: renamed from: l */
    public final MutableLiveData<ArrayList<Simple5>> f32088l;

    /* JADX INFO: renamed from: m */
    public final MutableLiveData<Boolean> f32089m;

    /* JADX INFO: renamed from: n */
    public final MutableLiveData<Integer> f32090n;

    /* JADX INFO: renamed from: o */
    public final UserRepository f32091o;

    public MainViewModel3(UserRepository userRepository) {
        Intrinsics2.m13089e(userRepository, "userRepository");
        this.f32091o = userRepository;
        this.f32088l = new MutableLiveData<>();
        this.f32089m = new MutableLiveData<>();
        this.f32090n = new MutableLiveData<>();
    }
}
