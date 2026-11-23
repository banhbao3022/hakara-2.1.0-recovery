package p555j.p556a.p557a.p558a.p559a.p562c;

import android.widget.ProgressBar;
import java.util.ArrayList;
import mtp.media.karaoke.data.model.User;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p558a.p559a.p561b.UserSuggestionAdapter;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p616i.ItemExploreBinding;
import p636z0.p759s.Observer;

/* JADX INFO: renamed from: j.a.a.a.a.c.d, reason: use source file name */
/* JADX INFO: compiled from: ExploreAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ExploreAdapter4<T> implements Observer<ArrayList<User>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ItemExploreBinding f31109a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ UserSuggestionAdapter f31110b;

    public ExploreAdapter4(ItemExploreBinding itemExploreBinding, UserSuggestionAdapter userSuggestionAdapter) {
        this.f31109a = itemExploreBinding;
        this.f31110b = userSuggestionAdapter;
    }

    @Override // p636z0.p759s.Observer
    /* JADX INFO: renamed from: d */
    public void mo410d(ArrayList<User> arrayList) {
        this.f31110b.m13977p(arrayList);
        this.f31109a.f32388w.m617m0(0);
        ProgressBar progressBar = this.f31109a.f32387v;
        Intrinsics2.m13088d(progressBar, "progressBar");
        SkuDao.a.m14109v(progressBar);
    }
}
