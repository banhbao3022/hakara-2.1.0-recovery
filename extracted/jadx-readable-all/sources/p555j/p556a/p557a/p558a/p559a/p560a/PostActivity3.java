package p555j.p556a.p557a.p558a.p559a.p560a;

import java.util.ArrayList;
import mtp.media.karaoke.data.model.User;
import mtp.media.karaoke.p628ui.screen.process.PostActivity;
import p636z0.p759s.Observer;

/* JADX INFO: renamed from: j.a.a.a.a.a.h, reason: use source file name */
/* JADX INFO: compiled from: PostActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class PostActivity3<T> implements Observer<ArrayList<User>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ PostActivity f31004a;

    public PostActivity3(PostActivity postActivity) {
        this.f31004a = postActivity;
    }

    @Override // p636z0.p759s.Observer
    /* JADX INFO: renamed from: d */
    public void mo410d(ArrayList<User> arrayList) {
        this.f31004a.f33700I.m13977p(arrayList);
    }
}
