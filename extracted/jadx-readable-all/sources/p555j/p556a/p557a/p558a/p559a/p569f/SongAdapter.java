package p555j.p556a.p557a.p558a.p559a.p569f;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Song;
import p000.C7405v0;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p558a.p592b.BaseListAdapter;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p616i.ItemSongBinding;
import p636z0.p774z.p775b.DiffUtil;

/* JADX INFO: renamed from: j.a.a.a.a.f.a, reason: use source file name */
/* JADX INFO: compiled from: SongAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class SongAdapter extends BaseListAdapter<Song, ItemSongBinding> {

    /* JADX INFO: renamed from: f */
    public final InterfaceC6164l<Song, Unit> f31281f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC6164l<Song, Unit> f31282g;

    /* JADX INFO: renamed from: j.a.a.a.a.f.a$a */
    /* JADX INFO: compiled from: kotlin-style lambda group */
    public static final class a extends Lambda implements InterfaceC6164l<Song, Unit> {

        /* JADX INFO: renamed from: g */
        public static final a f31283g = new a(0);

        /* JADX INFO: renamed from: h */
        public static final a f31284h = new a(1);

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ int f31285i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(1);
            this.f31285i = i;
        }

        @Override // p477d1.p493x.p494b.InterfaceC6164l
        /* JADX INFO: renamed from: b */
        public final Unit mo3b(Song song) {
            int i = this.f31285i;
            if (i == 0) {
                Intrinsics2.m13089e(song, "it");
                return Unit.f29502a;
            }
            if (i != 1) {
                throw null;
            }
            Intrinsics2.m13089e(song, "it");
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.f.a$b */
    /* JADX INFO: compiled from: SongAdapter.kt */
    public static final class b extends DiffUtil.e<Song> {
        @Override // p636z0.p774z.p775b.DiffUtil.e
        /* JADX INFO: renamed from: a */
        public boolean mo13878a(Song song, Song song2) {
            Song song3 = song;
            Song song4 = song2;
            Intrinsics2.m13089e(song3, "oldItem");
            Intrinsics2.m13089e(song4, "newItem");
            return Intrinsics2.m13085a(song3, song4);
        }

        @Override // p636z0.p774z.p775b.DiffUtil.e
        /* JADX INFO: renamed from: b */
        public boolean mo13879b(Song song, Song song2) {
            Song song3 = song;
            Song song4 = song2;
            Intrinsics2.m13089e(song3, "oldItem");
            Intrinsics2.m13089e(song4, "newItem");
            return song3.getId() == song4.getId();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SongAdapter() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ SongAdapter(InterfaceC6164l interfaceC6164l, InterfaceC6164l interfaceC6164l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? a.f31283g : interfaceC6164l, (i & 2) != 0 ? a.f31284h : interfaceC6164l2);
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter2
    /* JADX INFO: renamed from: c */
    public int mo13876c(int i) {
        return R.layout.item_song;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter
    /* JADX INFO: renamed from: n */
    public void mo13890n(ViewDataBinding viewDataBinding) {
        ItemSongBinding itemSongBinding = (ItemSongBinding) viewDataBinding;
        Intrinsics2.m13089e(itemSongBinding, "binding");
        View view = itemSongBinding.f726k;
        Intrinsics2.m13088d(view, "root");
        SkuDao.a.m14067S(view, new C7405v0(0, itemSongBinding, this));
        RelativeLayout relativeLayout = itemSongBinding.f32394x;
        Intrinsics2.m13088d(relativeLayout, "songView");
        SkuDao.a.m14067S(relativeLayout, new C7405v0(1, itemSongBinding, this));
        TextView textView = itemSongBinding.f32390t;
        Intrinsics2.m13088d(textView, "btnSing");
        SkuDao.a.m14067S(textView, new C7405v0(2, itemSongBinding, this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SongAdapter(InterfaceC6164l<? super Song, Unit> interfaceC6164l, InterfaceC6164l<? super Song, Unit> interfaceC6164l2) {
        super(new b());
        Intrinsics2.m13089e(interfaceC6164l, "itemClickListener");
        Intrinsics2.m13089e(interfaceC6164l2, "singClickListener");
        this.f31281f = interfaceC6164l;
        this.f31282g = interfaceC6164l2;
    }
}
