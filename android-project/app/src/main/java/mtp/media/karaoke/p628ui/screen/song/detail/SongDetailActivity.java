package mtp.media.karaoke.p628ui.screen.song.detail;

import android.animation.ArgbEvaluator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import java.util.HashMap;
import java.util.Objects;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Song;
import mtp.media.karaoke.p628ui.screen.search.SearchActivity;
import mtp.media.karaoke.p628ui.screen.sing.SingActivity;
import p000.C5769c0;
import p007c.p190n.p194b.p334e.p336b0.TabLayoutMediator;
import p007c.p190n.p194b.p334e.p348i.BottomSheetDialog;
import p477d1.Lazy3;
import p477d1.Lazy4;
import p477d1.LazyJVM;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.Reflection;
import p526i1.p536d.p543c.p551n.Qualifier;
import p555j.p556a.p557a.p558a.p559a.p567e.p568b.RecordingRankingAdapter2;
import p555j.p556a.p557a.p558a.p559a.p569f.p570f.SongDetailActivity2;
import p555j.p556a.p557a.p558a.p559a.p569f.p570f.SongDetailActivity3;
import p555j.p556a.p557a.p558a.p559a.p569f.p570f.SongDetailViewModel;
import p555j.p556a.p557a.p558a.p592b.BaseActivity3;
import p555j.p556a.p557a.p558a.p592b.BaseViewModel;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p616i.SongDetailActivityBinding;
import p636z0.p725k.p727d.ContextCompat;
import p636z0.p759s.ViewModelStoreOwner;

/* JADX INFO: compiled from: SongDetailActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class SongDetailActivity extends BaseActivity3<SongDetailActivityBinding, SongDetailViewModel> {

    /* JADX INFO: renamed from: w */
    public static final C7373c f33994w = new C7373c(null);

    /* JADX INFO: renamed from: A */
    public float f33995A;

    /* JADX INFO: renamed from: B */
    public int f33996B;

    /* JADX INFO: renamed from: C */
    public Song f33997C;

    /* JADX INFO: renamed from: D */
    public HashMap f33998D;

    /* JADX INFO: renamed from: x */
    public final int f33999x = R.layout.song_detail_activity;

    /* JADX INFO: renamed from: y */
    public final Lazy3 f34000y = LazyJVM.m13020a(Lazy4.NONE, new C7372b(this, null, null));

    /* JADX INFO: renamed from: z */
    public int f34001z;

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.song.detail.SongDetailActivity$a */
    /* JADX INFO: compiled from: kotlin-style lambda group */
    public static final class C7371a extends Lambda implements InterfaceC6153a<Unit> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ int f34002g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Object f34003h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7371a(int i, Object obj) {
            super(0);
            this.f34002g = i;
            this.f34003h = obj;
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public final Unit mo2c() {
            int i = this.f34002g;
            if (i == 0) {
                ((SongDetailActivity) this.f34003h).f143l.m133b();
                return Unit.f29502a;
            }
            if (i != 1) {
                if (i != 2) {
                    throw null;
                }
                ((SongDetailActivity) this.f34003h).startActivity(new Intent((SongDetailActivity) this.f34003h, (Class<?>) SearchActivity.class).addFlags(65536));
                ((SongDetailActivity) this.f34003h).overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return Unit.f29502a;
            }
            SongDetailActivity songDetailActivity = (SongDetailActivity) this.f34003h;
            Song song = songDetailActivity.f33997C;
            if (song != null) {
                if (song.getDuet_singer() == 0) {
                    View viewInflate = songDetailActivity.getLayoutInflater().inflate(R.layout.bottom_sheet_sing_question, (ViewGroup) null);
                    BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(songDetailActivity);
                    bottomSheetDialog.setContentView(viewInflate);
                    bottomSheetDialog.show();
                    Intrinsics2.m13088d(viewInflate, "view");
                    LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.optionSolo);
                    Intrinsics2.m13088d(linearLayout, "view.optionSolo");
                    SkuDao.a.m14067S(linearLayout, new C5769c0(0, songDetailActivity, song, bottomSheetDialog));
                    LinearLayout linearLayout2 = (LinearLayout) viewInflate.findViewById(R.id.optionDuet);
                    Intrinsics2.m13088d(linearLayout2, "view.optionDuet");
                    SkuDao.a.m14067S(linearLayout2, new C5769c0(1, songDetailActivity, song, bottomSheetDialog));
                } else {
                    songDetailActivity.m13971T(SingActivity.C7351e.m14457b(SingActivity.f33896w, songDetailActivity, song.getId(), 0, 0, 12));
                }
            }
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.song.detail.SongDetailActivity$b */
    /* JADX INFO: compiled from: ViewModelStoreOwnerExt.kt */
    public static final class C7372b extends Lambda implements InterfaceC6153a<SongDetailViewModel> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ViewModelStoreOwner f34004g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Qualifier f34005h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC6153a f34006i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7372b(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, InterfaceC6153a interfaceC6153a) {
            super(0);
            this.f34004g = viewModelStoreOwner;
            this.f34005h = qualifier;
            this.f34006i = interfaceC6153a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, j.a.a.a.a.f.f.c] */
        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public SongDetailViewModel mo2c() {
            return SkuDao.a.m14107t(this.f34004g, Reflection.m13097a(SongDetailViewModel.class), this.f34005h, this.f34006i);
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.song.detail.SongDetailActivity$c */
    /* JADX INFO: compiled from: SongDetailActivity.kt */
    public static final class C7373c {
        public C7373c() {
        }

        public C7373c(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseActivity3
    /* JADX INFO: renamed from: P */
    public int mo13967P() {
        return this.f33999x;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseActivity3
    /* JADX INFO: renamed from: R */
    public BaseViewModel mo13969R() {
        return (SongDetailViewModel) this.f34000y.getValue();
    }

    /* JADX INFO: renamed from: U */
    public View m14461U(int i) {
        if (this.f33998D == null) {
            this.f33998D = new HashMap();
        }
        View view = (View) this.f33998D.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        this.f33998D.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    /* JADX INFO: renamed from: V */
    public final void m14462V() {
        if (this.f33996B >= 50) {
            SkuDao.a.m14056H(this, true, false, 2);
        } else {
            SkuDao.a.m14056H(this, false, false, 3);
        }
        Window window = getWindow();
        Intrinsics2.m13088d(window, "window");
        Object objEvaluate = new ArgbEvaluator().evaluate(this.f33995A, 0, Integer.valueOf(ContextCompat.m16134b(this, R.color.white)));
        Objects.requireNonNull(objEvaluate, "null cannot be cast to non-null type kotlin.Int");
        window.setStatusBarColor(((Integer) objEvaluate).intValue());
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseActivity3, p636z0.p752p.p753c.FragmentActivity, androidx.activity.ComponentActivity, p636z0.p725k.p726c.ComponentActivity2, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SkuDao.a.m14056H(this, false, false, 3);
        Toolbar toolbar = (Toolbar) m14461U(R.id.toolbar);
        Intrinsics2.m13088d(toolbar, "toolbar");
        SkuDao.a.m14066R(toolbar, SkuDao.a.m14105r(this));
        RelativeLayout relativeLayout = (RelativeLayout) m14461U(R.id.songDetailLayout);
        Intrinsics2.m13088d(relativeLayout, "songDetailLayout");
        SkuDao.a.m14066R(relativeLayout, SkuDao.a.m14105r(this) + 65);
        TextView textView = (TextView) m14461U(R.id.toolbarTitle);
        Intrinsics2.m13088d(textView, "toolbarTitle");
        textView.setSelected(true);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dp_100);
        this.f34001z = dimensionPixelSize;
        this.f33996B = dimensionPixelSize;
        m14462V();
        ((AppBarLayout) m14461U(R.id.appBarLayout)).m12678a(new SongDetailActivity3(this));
        Intent intent = getIntent();
        Intrinsics2.m13088d(intent, "intent");
        Bundle extras = intent.getExtras();
        this.f33997C = extras != null ? (Song) extras.getParcelable("song") : null;
        ((SongDetailViewModel) this.f34000y.getValue()).f31312l.mo427j(this.f33997C);
        Song song = this.f33997C;
        if (song != null) {
            RecordingRankingAdapter2 recordingRankingAdapter2 = new RecordingRankingAdapter2(this, song.getId());
            ViewPager2 viewPager2 = (ViewPager2) m14461U(R.id.pages);
            Intrinsics2.m13088d(viewPager2, "pages");
            viewPager2.setAdapter(recordingRankingAdapter2);
            new TabLayoutMediator((TabLayout) m14461U(R.id.tabs), (ViewPager2) m14461U(R.id.pages), new SongDetailActivity2(this)).m11024a();
        }
        ImageView imageView = (ImageView) m14461U(R.id.btnBack);
        Intrinsics2.m13088d(imageView, "btnBack");
        SkuDao.a.m14067S(imageView, new C7371a(0, this));
        TextView textView2 = (TextView) m14461U(R.id.btnSing);
        Intrinsics2.m13088d(textView2, "btnSing");
        SkuDao.a.m14067S(textView2, new C7371a(1, this));
        ImageView imageView2 = (ImageView) m14461U(R.id.btnSearch);
        Intrinsics2.m13088d(imageView2, "btnSearch");
        SkuDao.a.m14067S(imageView2, new C7371a(2, this));
    }
}
