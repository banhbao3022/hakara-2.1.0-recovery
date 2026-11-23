package p555j.p556a.p557a.p558a.p559a.p560a;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import mtp.media.karaoke.data.model.Simple2;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p498z.Random;
import p636z0.p759s.Observer;

/* JADX INFO: renamed from: j.a.a.a.a.a.d, reason: use source file name */
/* JADX INFO: compiled from: BackgroundFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class BackgroundFragment3<T> implements Observer<ArrayList<Simple2>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BackgroundFragment2 f30988a;

    public BackgroundFragment3(BackgroundFragment2 backgroundFragment2) {
        this.f30988a = backgroundFragment2;
    }

    @Override // p636z0.p759s.Observer
    /* JADX INFO: renamed from: d */
    public void mo410d(ArrayList<Simple2> arrayList) {
        ArrayList<Simple2> arrayList2 = arrayList;
        this.f30988a.f30980f0.m13977p(arrayList2);
        Intrinsics2.m13088d(arrayList2, "it");
        Random.a aVar = Random.f29609b;
        Intrinsics2.m13089e(arrayList2, "$this$random");
        Intrinsics2.m13089e(aVar, "random");
        if (arrayList2.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        int iMo13105c = aVar.mo13105c(arrayList2.size());
        Intrinsics2.m13089e(arrayList2, "$this$elementAt");
        Simple2 simple2 = arrayList2.get(iMo13105c);
        BackgroundFragment2.c cVar = this.f30988a.f30981g0;
        if (cVar != null) {
            cVar.mo13885x(simple2);
        }
    }
}
