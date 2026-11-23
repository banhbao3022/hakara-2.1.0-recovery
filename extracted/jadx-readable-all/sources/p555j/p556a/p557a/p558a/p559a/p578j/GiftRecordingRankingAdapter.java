package p555j.p556a.p557a.p558a.p559a.p578j;

import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Present;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p558a.p592b.BaseListAdapter;
import p555j.p556a.p557a.p616i.ItemPlayingGiftRankingBinding;
import p636z0.p774z.p775b.DiffUtil;

/* JADX INFO: renamed from: j.a.a.a.a.j.e, reason: use source file name */
/* JADX INFO: compiled from: GiftRecordingRankingAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class GiftRecordingRankingAdapter extends BaseListAdapter<Present, ItemPlayingGiftRankingBinding> {

    /* JADX INFO: renamed from: j.a.a.a.a.j.e$a */
    /* JADX INFO: compiled from: GiftRecordingRankingAdapter.kt */
    public static final class a extends DiffUtil.e<Present> {
        @Override // p636z0.p774z.p775b.DiffUtil.e
        /* JADX INFO: renamed from: a */
        public boolean mo13878a(Present present, Present present2) {
            Present present3 = present;
            Present present4 = present2;
            Intrinsics2.m13089e(present3, "oldItem");
            Intrinsics2.m13089e(present4, "newItem");
            return Intrinsics2.m13085a(present3, present4);
        }

        @Override // p636z0.p774z.p775b.DiffUtil.e
        /* JADX INFO: renamed from: b */
        public boolean mo13879b(Present present, Present present2) {
            Present present3 = present;
            Present present4 = present2;
            Intrinsics2.m13089e(present3, "oldItem");
            Intrinsics2.m13089e(present4, "newItem");
            return present3.getId() == present4.getId();
        }
    }

    public GiftRecordingRankingAdapter() {
        super(new a());
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter2
    /* JADX INFO: renamed from: c */
    public int mo13876c(int i) {
        return R.layout.item_playing_gift_ranking;
    }
}
