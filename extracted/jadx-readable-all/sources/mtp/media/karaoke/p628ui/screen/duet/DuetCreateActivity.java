package mtp.media.karaoke.p628ui.screen.duet;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import mtp.media.karaoke.R;
import mtp.media.karaoke.addon.seekbar.CustomSeekBar;
import mtp.media.karaoke.data.model.Duet2;
import mtp.media.karaoke.data.model.Song;
import mtp.media.karaoke.p628ui.screen.sing.SingActivity;
import p007c.p043b.p044a.p045a.p051b.YouTubePlayer;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p430e.GsonBuilder;
import p477d1.Lazy3;
import p477d1.Lazy4;
import p477d1.LazyJVM;
import p477d1.Unit;
import p477d1.p483s._Collections;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.Reflection;
import p526i1.p536d.p543c.p551n.Qualifier;
import p555j.p556a.p557a.p558a.p559a.p563d.DuetCreateActivity3;
import p555j.p556a.p557a.p558a.p559a.p590r.C6799h0;
import p555j.p556a.p557a.p558a.p592b.BaseActivity3;
import p555j.p556a.p557a.p597g.p600c.ProgressItem;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p606h.p609c.p612c.ModelPrefs;
import p555j.p556a.p557a.p616i.DuetCreateActivityBinding;
import p636z0.p644b.p645c.ActionBar;
import p636z0.p759s.Observer;
import p636z0.p759s.ViewModelStoreOwner;

/* JADX INFO: compiled from: DuetCreateActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DuetCreateActivity extends BaseActivity3<DuetCreateActivityBinding, C6799h0> {

    /* JADX INFO: renamed from: w */
    public static final C7253c f33518w = new C7253c(null);

    /* JADX INFO: renamed from: A */
    public YouTubePlayer f33519A;

    /* JADX INFO: renamed from: B */
    public float f33520B;

    /* JADX INFO: renamed from: F */
    public ProgressItem f33524F;

    /* JADX INFO: renamed from: H */
    public HashMap f33526H;

    /* JADX INFO: renamed from: z */
    public Song f33529z;

    /* JADX INFO: renamed from: x */
    public final int f33527x = R.layout.duet_create_activity;

    /* JADX INFO: renamed from: y */
    public final Lazy3 f33528y = LazyJVM.m13020a(Lazy4.NONE, new C7252b(this, null, null));

    /* JADX INFO: renamed from: C */
    public String f33521C = "A";

    /* JADX INFO: renamed from: D */
    public ArrayList<ProgressItem> f33522D = new ArrayList<>();

    /* JADX INFO: renamed from: E */
    public ArrayList<Duet2> f33523E = new ArrayList<>();

    /* JADX INFO: renamed from: G */
    public String f33525G = "";

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.duet.DuetCreateActivity$a */
    /* JADX INFO: compiled from: kotlin-style lambda group */
    /* JADX INFO: loaded from: classes.dex */
    public static final class C7251a extends Lambda implements InterfaceC6153a<Unit> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ int f33530g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Object f33531h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7251a(int i, Object obj) {
            super(0);
            this.f33530g = i;
            this.f33531h = obj;
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public final Unit mo2c() {
            int i = this.f33530g;
            if (i == 0) {
                if ((!Intrinsics2.m13085a(((DuetCreateActivity) this.f33531h).f33521C, "A")) || DuetCreateActivity.m14353V((DuetCreateActivity) this.f33531h)) {
                    DuetCreateActivity duetCreateActivity = (DuetCreateActivity) this.f33531h;
                    duetCreateActivity.f33521C = "A";
                    DuetCreateActivity.m14354W(duetCreateActivity);
                }
                return Unit.f29502a;
            }
            if (i == 1) {
                if ((!Intrinsics2.m13085a(((DuetCreateActivity) this.f33531h).f33521C, "B")) || DuetCreateActivity.m14353V((DuetCreateActivity) this.f33531h)) {
                    DuetCreateActivity duetCreateActivity2 = (DuetCreateActivity) this.f33531h;
                    duetCreateActivity2.f33521C = "B";
                    DuetCreateActivity.m14354W(duetCreateActivity2);
                }
                return Unit.f29502a;
            }
            if (i == 2) {
                if ((!Intrinsics2.m13085a(((DuetCreateActivity) this.f33531h).f33521C, "C")) || DuetCreateActivity.m14353V((DuetCreateActivity) this.f33531h)) {
                    DuetCreateActivity duetCreateActivity3 = (DuetCreateActivity) this.f33531h;
                    duetCreateActivity3.f33521C = "C";
                    DuetCreateActivity.m14354W(duetCreateActivity3);
                }
                return Unit.f29502a;
            }
            if (i != 3) {
                throw null;
            }
            if (((DuetCreateActivity) this.f33531h).f33523E.size() > 0) {
                DuetCreateActivity duetCreateActivity4 = (DuetCreateActivity) this.f33531h;
                ArrayList<Duet2> arrayList = duetCreateActivity4.f33523E;
                String str = duetCreateActivity4.f33525G;
                Intrinsics2.m13089e(str, "key");
                String strM12319f = new GsonBuilder().m12322a().m12319f(arrayList);
                SharedPreferences sharedPreferences = ModelPrefs.f32358a;
                if (sharedPreferences == null) {
                    Intrinsics2.m13096l("preferences");
                    throw null;
                }
                sharedPreferences.edit().putString(str, strM12319f).apply();
                DuetCreateActivity duetCreateActivity5 = (DuetCreateActivity) this.f33531h;
                Song song = duetCreateActivity5.f33529z;
                if (song != null) {
                    ((DuetCreateActivity) this.f33531h).m13971T(SingActivity.C7351e.m14457b(SingActivity.f33896w, duetCreateActivity5, song.getId(), 1, 0, 8));
                }
            }
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.duet.DuetCreateActivity$b */
    /* JADX INFO: compiled from: ViewModelStoreOwnerExt.kt */
    public static final class C7252b extends Lambda implements InterfaceC6153a<C6799h0> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ViewModelStoreOwner f33532g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Qualifier f33533h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC6153a f33534i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7252b(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, InterfaceC6153a interfaceC6153a) {
            super(0);
            this.f33532g = viewModelStoreOwner;
            this.f33533h = qualifier;
            this.f33534i = interfaceC6153a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, j.a.a.a.a.r.h0] */
        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public C6799h0 mo2c() {
            return SkuDao.a.m14107t(this.f33532g, Reflection.m13097a(C6799h0.class), this.f33533h, this.f33534i);
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.duet.DuetCreateActivity$c */
    /* JADX INFO: compiled from: DuetCreateActivity.kt */
    public static final class C7253c {
        public C7253c() {
        }

        /* JADX INFO: renamed from: a */
        public final Intent m14359a(Context context, Song song) {
            Intrinsics2.m13089e(context, "context");
            Intrinsics2.m13089e(song, "song");
            Intent intent = new Intent(context, (Class<?>) DuetCreateActivity.class);
            intent.putExtra("song", song);
            return intent;
        }

        public C7253c(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.duet.DuetCreateActivity$d */
    /* JADX INFO: compiled from: DuetCreateActivity.kt */
    public static final class C7254d<T> implements Observer<Song> {
        public C7254d() {
        }

        @Override // p636z0.p759s.Observer
        /* JADX INFO: renamed from: d */
        public void mo410d(Song song) {
            DuetCreateActivity.this.f33525G = "duet_segment_" + song.getId();
            String str = DuetCreateActivity.this.f33525G;
            SharedPreferences sharedPreferences = ModelPrefs.f32358a;
            if (sharedPreferences == null) {
                Intrinsics2.m13096l("preferences");
                throw null;
            }
            ArrayList arrayList = (ArrayList) outline.m1584f(sharedPreferences.getString(str, null), ArrayList.class);
            if (arrayList != null) {
                Iterator<T> it = arrayList.iterator();
                while (it.hasNext()) {
                    Object objM12315b = new GsonBuilder().m12322a().m12315b(it.next().toString(), Duet2.class);
                    Intrinsics2.m13088d(objM12315b, "GsonBuilder().create().f… DuetSegment::class.java)");
                    DuetCreateActivity.this.f33523E.add((Duet2) objM12315b);
                }
            }
            DuetCreateActivity duetCreateActivity = DuetCreateActivity.this;
            duetCreateActivity.f139h.mo16727a((YouTubePlayerView) duetCreateActivity.m14355U(R.id.youTubePlayerView));
            YouTubePlayerView youTubePlayerView = (YouTubePlayerView) duetCreateActivity.m14355U(R.id.youTubePlayerView);
            DuetCreateActivity3 duetCreateActivity3 = new DuetCreateActivity3(duetCreateActivity);
            Objects.requireNonNull(youTubePlayerView);
            Intrinsics2.m13090f(duetCreateActivity3, "youTubePlayerListener");
            youTubePlayerView.f29314f.getYouTubePlayer$core_release().mo1320c(duetCreateActivity3);
        }
    }

    /* JADX INFO: renamed from: V */
    public static final boolean m14353V(DuetCreateActivity duetCreateActivity) {
        boolean z = false;
        for (Duet2 duet2 : duetCreateActivity.f33523E) {
            CustomSeekBar customSeekBar = (CustomSeekBar) duetCreateActivity.m14355U(R.id.seekBar);
            Intrinsics2.m13088d(customSeekBar, "seekBar");
            if (customSeekBar.getProgress() > duet2.getS()) {
                CustomSeekBar customSeekBar2 = (CustomSeekBar) duetCreateActivity.m14355U(R.id.seekBar);
                Intrinsics2.m13088d(customSeekBar2, "seekBar");
                if (customSeekBar2.getProgress() < duet2.getE() && duet2.getE() < duetCreateActivity.f33520B) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: W */
    public static final void m14354W(DuetCreateActivity duetCreateActivity) {
        CustomSeekBar customSeekBar = (CustomSeekBar) duetCreateActivity.m14355U(R.id.seekBar);
        Intrinsics2.m13088d(customSeekBar, "seekBar");
        float progress = customSeekBar.getProgress();
        if (duetCreateActivity.m14356X(progress)) {
            duetCreateActivity.f33523E.add(new Duet2(duetCreateActivity.f33521C, progress, duetCreateActivity.f33520B));
        }
        String string = duetCreateActivity.f33523E.toString();
        Intrinsics2.m13088d(string, "segments.toString()");
        Intrinsics2.m13089e(string, "message");
        duetCreateActivity.m14357Y();
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseActivity3
    /* JADX INFO: renamed from: P */
    public int mo13967P() {
        return this.f33527x;
    }

    /* JADX INFO: renamed from: U */
    public View m14355U(int i) {
        if (this.f33526H == null) {
            this.f33526H = new HashMap();
        }
        View view = (View) this.f33526H.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        this.f33526H.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    /* JADX INFO: renamed from: X */
    public final boolean m14356X(float f) {
        if (this.f33523E.size() <= 0) {
            return true;
        }
        Duet2 duet2 = (Duet2) _Collections.m13047l(this.f33523E);
        if (f > duet2.getS()) {
            duet2.setE(f);
            return true;
        }
        Intrinsics2.m13089e("recheck", "message");
        this.f33523E.remove(duet2);
        return m14356X(f);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: Y */
    public final void m14357Y() {
        this.f33522D.clear();
        if (this.f33523E.size() <= 0) {
            this.f33523E.add(new Duet2(this.f33521C, 0.0f, this.f33520B));
        }
        for (Duet2 duet2 : this.f33523E) {
            ProgressItem progressItem = new ProgressItem();
            this.f33524F = progressItem;
            progressItem.f32172b = ((duet2.getE() - duet2.getS()) / this.f33520B) * 100;
            String n = duet2.getN();
            switch (n.hashCode()) {
                case 65:
                    if (n.equals("A")) {
                        ProgressItem progressItem2 = this.f33524F;
                        if (progressItem2 == null) {
                            Intrinsics2.m13096l("mProgressItem");
                            throw null;
                        }
                        progressItem2.f32171a = R.color.header_color;
                    }
                    break;
                case 66:
                    if (n.equals("B")) {
                        ProgressItem progressItem3 = this.f33524F;
                        if (progressItem3 == null) {
                            Intrinsics2.m13096l("mProgressItem");
                            throw null;
                        }
                        progressItem3.f32171a = R.color.pink_A400;
                    }
                    break;
                case 67:
                    if (n.equals("C")) {
                        ProgressItem progressItem4 = this.f33524F;
                        if (progressItem4 == null) {
                            Intrinsics2.m13096l("mProgressItem");
                            throw null;
                        }
                        progressItem4.f32171a = R.color.deep_purple_700;
                    }
                    break;
            }
            ArrayList<ProgressItem> arrayList = this.f33522D;
            ProgressItem progressItem5 = this.f33524F;
            if (progressItem5 == null) {
                Intrinsics2.m13096l("mProgressItem");
                throw null;
            }
            arrayList.add(progressItem5);
        }
        CustomSeekBar customSeekBar = (CustomSeekBar) m14355U(R.id.seekBar);
        ArrayList<ProgressItem> arrayList2 = this.f33522D;
        Objects.requireNonNull(customSeekBar);
        Intrinsics2.m13089e(arrayList2, "progressItemsList");
        customSeekBar.f33449g = arrayList2;
        ((CustomSeekBar) m14355U(R.id.seekBar)).invalidate();
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseActivity3
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public C6799h0 mo13969R() {
        return (C6799h0) this.f33528y.getValue();
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseActivity3, p636z0.p752p.p753c.FragmentActivity, androidx.activity.ComponentActivity, p636z0.p725k.p726c.ComponentActivity2, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SkuDao.a.m14055G(this, true, false);
        Toolbar toolbar = (Toolbar) m14355U(R.id.toolbar);
        Intrinsics2.m13088d(toolbar, "toolbar");
        SkuDao.a.m14066R(toolbar, SkuDao.a.m14105r(this));
        m14615N((Toolbar) m14355U(R.id.toolbar));
        ActionBar actionBarM14610I = m14610I();
        if (actionBarM14610I != null) {
            actionBarM14610I.mo14597q(R.string.title_duet_create);
        }
        ActionBar actionBarM14610I2 = m14610I();
        if (actionBarM14610I2 != null) {
            actionBarM14610I2.mo14593m(true);
        }
        ActionBar actionBarM14610I3 = m14610I();
        if (actionBarM14610I3 != null) {
            actionBarM14610I3.mo14594n(true);
        }
        Intent intent = getIntent();
        Intrinsics2.m13088d(intent, "intent");
        Bundle extras = intent.getExtras();
        this.f33529z = extras != null ? (Song) extras.getParcelable("song") : null;
        mo13969R().f31857l.mo427j(this.f33529z);
        mo13969R().f31857l.mo422e(this, new C7254d());
        ((YouTubePlayerView) m14355U(R.id.youTubePlayerView)).getPlayerUiController().mo1308r(false);
        ((YouTubePlayerView) m14355U(R.id.youTubePlayerView)).getPlayerUiController().mo1300j(false);
        ((YouTubePlayerView) m14355U(R.id.youTubePlayerView)).getPlayerUiController().mo1306p(false);
        ((YouTubePlayerView) m14355U(R.id.youTubePlayerView)).getPlayerUiController().mo1299i(false);
        ((YouTubePlayerView) m14355U(R.id.youTubePlayerView)).getPlayerUiController().mo1292b(false);
        ((YouTubePlayerView) m14355U(R.id.youTubePlayerView)).getPlayerUiController().mo1303m(false);
        ((YouTubePlayerView) m14355U(R.id.youTubePlayerView)).getPlayerUiController().mo1305o(true);
        TextView textView = (TextView) m14355U(R.id.btnDuetA);
        Intrinsics2.m13088d(textView, "btnDuetA");
        SkuDao.a.m14067S(textView, new C7251a(0, this));
        TextView textView2 = (TextView) m14355U(R.id.btnDuetB);
        Intrinsics2.m13088d(textView2, "btnDuetB");
        SkuDao.a.m14067S(textView2, new C7251a(1, this));
        TextView textView3 = (TextView) m14355U(R.id.btnDuetAB);
        Intrinsics2.m13088d(textView3, "btnDuetAB");
        SkuDao.a.m14067S(textView3, new C7251a(2, this));
        TextView textView4 = (TextView) m14355U(R.id.btnStart);
        Intrinsics2.m13088d(textView4, "btnStart");
        SkuDao.a.m14067S(textView4, new C7251a(3, this));
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Intrinsics2.m13089e(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.f143l.m133b();
        return true;
    }
}
