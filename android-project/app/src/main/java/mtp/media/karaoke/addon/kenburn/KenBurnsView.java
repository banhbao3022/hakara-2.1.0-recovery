package mtp.media.karaoke.addon.kenburn;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import mtp.media.karaoke.R;
import p007c.p071d.p078c.p079a.outline;
import p007c.p085g.p086a.Glide;
import p477d1.NoWhenBranchMatchedException;
import p477d1.p483s.Collections2;
import p477d1.p483s._Arrays;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p597g.p598a.LoopViewPager;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p636z0.p667e.p676b.C7804v0;

/* JADX INFO: compiled from: KenBurnsView.kt */
/* JADX INFO: loaded from: classes.dex */
public final class KenBurnsView extends FrameLayout {

    /* JADX INFO: renamed from: f */
    public static int f33427f;

    /* JADX INFO: renamed from: g */
    public int f33428g;

    /* JADX INFO: renamed from: h */
    public final Handler f33429h;

    /* JADX INFO: renamed from: i */
    public final Context f33430i;

    /* JADX INFO: renamed from: j */
    public ImageView[] f33431j;

    /* JADX INFO: renamed from: k */
    public FrameLayout f33432k;

    /* JADX INFO: renamed from: l */
    public final Random f33433l;

    /* JADX INFO: renamed from: m */
    public final int f33434m;

    /* JADX INFO: renamed from: n */
    public final int f33435n;

    /* JADX INFO: renamed from: o */
    public final float f33436o;

    /* JADX INFO: renamed from: p */
    public final float f33437p;

    /* JADX INFO: renamed from: q */
    public int f33438q;

    /* JADX INFO: renamed from: r */
    public int f33439r;

    /* JADX INFO: renamed from: s */
    public ArrayList<String> f33440s;

    /* JADX INFO: renamed from: t */
    public ArrayList<Integer> f33441t;

    /* JADX INFO: renamed from: u */
    public ArrayList<Object> f33442u;

    /* JADX INFO: renamed from: v */
    public LoopViewPager f33443v;

    /* JADX INFO: renamed from: w */
    public ImageView.ScaleType f33444w;

    /* JADX INFO: renamed from: x */
    public final Runnable f33445x;

    /* JADX INFO: renamed from: y */
    public final Runnable f33446y;

    /* JADX INFO: renamed from: mtp.media.karaoke.addon.kenburn.KenBurnsView$a */
    /* JADX INFO: compiled from: KenBurnsView.kt */
    public static final class C7235a {
        public C7235a() {
        }

        public C7235a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.addon.kenburn.KenBurnsView$b */
    /* JADX INFO: compiled from: KenBurnsView.kt */
    public static final class RunnableC7236b implements Runnable {
        public RunnableC7236b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            KenBurnsView.m14333b(KenBurnsView.this);
            KenBurnsView kenBurnsView = KenBurnsView.this;
            kenBurnsView.f33429h.postDelayed(kenBurnsView.f33445x, ((long) kenBurnsView.f33434m) - (((long) kenBurnsView.f33435n) * ((long) 2)));
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.addon.kenburn.KenBurnsView$c */
    /* JADX INFO: compiled from: KenBurnsView.kt */
    public static final class RunnableC7237c implements Runnable {
        public RunnableC7237c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            KenBurnsView.m14332a(KenBurnsView.this);
            KenBurnsView kenBurnsView = KenBurnsView.this;
            kenBurnsView.f33429h.postDelayed(this, ((long) kenBurnsView.f33434m) - (((long) kenBurnsView.f33435n) * ((long) 2)));
        }
    }

    static {
        new C7235a(null);
    }

    public KenBurnsView(Context context) {
        this(context, null, 0, 6, null);
    }

    public KenBurnsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ KenBurnsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: a */
    public static final void m14332a(KenBurnsView kenBurnsView) {
        ImageView imageView;
        ImageView[] imageViewArr = kenBurnsView.f33431j;
        if (imageViewArr != null) {
            if (imageViewArr.length == 0) {
                return;
            }
        }
        int i = kenBurnsView.f33439r;
        if (i == -1) {
            kenBurnsView.f33439r = 0;
            if (imageViewArr == null || (imageView = imageViewArr[0]) == null) {
                return;
            }
            kenBurnsView.m14334c(imageView);
            return;
        }
        int i2 = i + 1;
        kenBurnsView.f33439r = i2;
        if (i2 >= (imageViewArr != null ? imageViewArr.length : 0)) {
            kenBurnsView.f33439r = 0;
        }
        if (kenBurnsView.f33443v != null) {
            int i3 = kenBurnsView.f33438q + 1;
            kenBurnsView.f33438q = i3;
            if (i3 >= kenBurnsView.getSizeByLoadType()) {
                kenBurnsView.f33438q = 0;
            }
            LoopViewPager loopViewPager = kenBurnsView.f33443v;
            Intrinsics2.m13087c(loopViewPager);
            loopViewPager.m13993y(kenBurnsView.f33438q, false);
        }
        ImageView[] imageViewArr2 = kenBurnsView.f33431j;
        ImageView imageView2 = imageViewArr2 != null ? imageViewArr2[kenBurnsView.f33439r] : null;
        kenBurnsView.m14337f(kenBurnsView.f33439r, kenBurnsView.f33438q);
        if (imageView2 != null) {
            imageView2.setAlpha(0.0f);
        }
        ImageView[] imageViewArr3 = kenBurnsView.f33431j;
        ImageView imageView3 = imageViewArr3 != null ? imageViewArr3[i] : null;
        if (imageView2 != null) {
            kenBurnsView.m14334c(imageView2);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(kenBurnsView.f33435n);
            animatorSet.playTogether(ObjectAnimator.ofFloat(imageView3, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView2, "alpha", 0.0f, 1.0f));
            animatorSet.start();
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m14333b(KenBurnsView kenBurnsView) {
        ImageView imageView;
        ImageView[] imageViewArr = kenBurnsView.f33431j;
        if (imageViewArr != null) {
            if (imageViewArr.length == 0) {
                return;
            }
        }
        int i = kenBurnsView.f33439r;
        if (i == -1) {
            kenBurnsView.f33439r = 0;
            if (imageViewArr == null || (imageView = imageViewArr[0]) == null) {
                return;
            }
            kenBurnsView.m14334c(imageView);
            return;
        }
        kenBurnsView.f33439r = kenBurnsView.f33438q <= 0 ? kenBurnsView.m14339h(i, true) : kenBurnsView.m14339h(i, false);
        if (kenBurnsView.f33438q == kenBurnsView.getSizeByLoadType() - 1) {
            kenBurnsView.f33439r = kenBurnsView.m14339h(kenBurnsView.f33439r, true);
        }
        if (kenBurnsView.getSizeByLoadType() - 1 == 0 && kenBurnsView.f33438q == 0) {
            kenBurnsView.f33439r = kenBurnsView.m14339h(kenBurnsView.f33439r, false);
        }
        int i2 = kenBurnsView.f33439r;
        ImageView[] imageViewArr2 = kenBurnsView.f33431j;
        if (i2 >= (imageViewArr2 != null ? imageViewArr2.length : 0)) {
            kenBurnsView.f33439r = 0;
        }
        ImageView imageView2 = imageViewArr2 != null ? imageViewArr2[kenBurnsView.f33439r] : null;
        kenBurnsView.m14337f(kenBurnsView.f33439r, kenBurnsView.f33438q);
        if (imageView2 != null) {
            imageView2.setAlpha(0.0f);
        }
        ImageView[] imageViewArr3 = kenBurnsView.f33431j;
        ImageView imageView3 = imageViewArr3 != null ? imageViewArr3[i] : null;
        if (imageView2 != null) {
            kenBurnsView.m14334c(imageView2);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(kenBurnsView.f33435n);
            animatorSet.playTogether(ObjectAnimator.ofFloat(imageView3, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView2, "alpha", 0.0f, 1.0f));
            animatorSet.start();
        }
    }

    private final int getSizeByLoadType() {
        int size;
        int i = f33427f;
        if (i > 0) {
            return i;
        }
        int iM15315d = C7804v0.m15315d(this.f33428g);
        if (iM15315d == 0) {
            size = this.f33440s.size();
        } else if (iM15315d == 1) {
            size = this.f33441t.size();
        } else {
            if (iM15315d != 2) {
                throw new NoWhenBranchMatchedException();
            }
            size = this.f33442u.size();
        }
        f33427f = size;
        return size;
    }

    /* JADX INFO: renamed from: c */
    public final void m14334c(ImageView imageView) {
        float f = this.f33437p;
        float fNextFloat = this.f33433l.nextFloat();
        float f2 = this.f33436o;
        float f3 = this.f33437p;
        float fM1576a = outline.m1576a(f2, f3, fNextFloat, f);
        float fM1576a2 = outline.m1576a(this.f33436o, this.f33437p, this.f33433l.nextFloat(), f3);
        float fM14338g = m14338g(imageView.getWidth(), fM1576a);
        float fM14338g2 = m14338g(imageView.getHeight(), fM1576a);
        float fM14338g3 = m14338g(imageView.getWidth(), fM1576a2);
        float fM14338g4 = m14338g(imageView.getHeight(), fM1576a2);
        long j2 = this.f33434m;
        imageView.setScaleX(fM1576a);
        imageView.setScaleY(fM1576a);
        imageView.setTranslationX(fM14338g);
        imageView.setTranslationY(fM14338g2);
        imageView.animate().translationX(fM14338g3).translationY(fM14338g4).scaleX(fM1576a2).scaleY(fM1576a2).setDuration(j2).start();
    }

    /* JADX INFO: renamed from: d */
    public final void m14335d(ArrayList<String> arrayList) {
        Intrinsics2.m13089e(arrayList, "strings");
        this.f33428g = 1;
        f33427f = 0;
        this.f33440s = arrayList;
        FrameLayout frameLayout = this.f33432k;
        if (frameLayout != null) {
            Intrinsics2.m13087c(frameLayout);
            this.f33431j = new ImageView[3];
            for (int i = 2; i >= 0; i--) {
                ImageView[] imageViewArr = this.f33431j;
                Intrinsics2.m13087c(imageViewArr);
                imageViewArr[i] = new ImageView(this.f33430i);
                if (i != 0) {
                    ImageView[] imageViewArr2 = this.f33431j;
                    Intrinsics2.m13087c(imageViewArr2);
                    ImageView imageView = imageViewArr2[i];
                    if (imageView != null) {
                        imageView.setAlpha(0.0f);
                    }
                }
                if (this.f33444w != null) {
                    ImageView[] imageViewArr3 = this.f33431j;
                    Intrinsics2.m13087c(imageViewArr3);
                    ImageView imageView2 = imageViewArr3[i];
                    if (imageView2 != null) {
                        imageView2.setScaleType(this.f33444w);
                    }
                }
                ImageView[] imageViewArr4 = this.f33431j;
                Intrinsics2.m13087c(imageViewArr4);
                ImageView imageView3 = imageViewArr4[i];
                if (imageView3 != null) {
                    imageView3.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                }
                ImageView[] imageViewArr5 = this.f33431j;
                Intrinsics2.m13087c(imageViewArr5);
                frameLayout.addView(imageViewArr5[i]);
            }
            m14337f(0, 0);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m14336e(int i, int i2) {
        ImageView[] imageViewArr;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        int iM15315d = C7804v0.m15315d(this.f33428g);
        if (iM15315d == 0) {
            ArrayList<String> arrayList = this.f33440s;
            Intrinsics2.m13089e(arrayList, "$this$getOrNull");
            ImageView imageView4 = null;
            String str = (i < 0 || i > Collections2.m13037b(arrayList)) ? null : arrayList.get(i);
            if (str == null || (imageViewArr = this.f33431j) == null) {
                return;
            }
            Intrinsics2.m13089e(imageViewArr, "$this$getOrNull");
            if (i2 >= 0 && i2 <= _Arrays.m13032f(imageViewArr)) {
                imageView4 = imageViewArr[i2];
            }
            ImageView imageView5 = imageView4;
            if (imageView5 != null) {
                SkuDao.a.m14054F(imageView5, str, null, null, null, null, true, false, false, 0, false, null, null, null, 8158);
                return;
            }
            return;
        }
        if (iM15315d == 1) {
            ImageView[] imageViewArr2 = this.f33431j;
            if (imageViewArr2 == null || (imageView = imageViewArr2[i2]) == null) {
                return;
            }
            Glide.m1627e(this.f33430i).mo1655o(this.f33441t.get(i)).m1642N(imageView);
            return;
        }
        if (iM15315d != 2) {
            return;
        }
        Object obj = this.f33442u.get(i);
        Intrinsics2.m13088d(obj, "mMixingList[position]");
        if (Intrinsics2.m13085a(obj.getClass(), String.class)) {
            String str2 = (String) obj;
            ImageView[] imageViewArr3 = this.f33431j;
            if (imageViewArr3 == null || (imageView3 = imageViewArr3[i2]) == null) {
                return;
            }
            SkuDao.a.m14054F(imageView3, str2, null, null, null, null, true, false, false, 0, false, null, null, null, 8158);
            return;
        }
        if (Intrinsics2.m13085a(obj.getClass(), Integer.TYPE)) {
            int iIntValue = ((Integer) obj).intValue();
            ImageView[] imageViewArr4 = this.f33431j;
            if (imageViewArr4 == null || (imageView2 = imageViewArr4[i2]) == null) {
                return;
            }
            Glide.m1627e(this.f33430i).mo1655o(Integer.valueOf(iIntValue)).m1642N(imageView2);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m14337f(int i, int i2) {
        m14336e(i2, i);
        int sizeByLoadType = i2 - 1;
        int i3 = i2 + 1;
        if (sizeByLoadType < 0) {
            sizeByLoadType = getSizeByLoadType() - 1;
        }
        if (i3 > getSizeByLoadType() - 1) {
            i3 = 0;
        }
        if (i == 0) {
            if (i2 != sizeByLoadType) {
                m14336e(sizeByLoadType, 2);
            }
            if (i2 != i3) {
                m14336e(i3, 1);
                return;
            }
            return;
        }
        if (i == 1) {
            if (i2 != sizeByLoadType) {
                m14336e(sizeByLoadType, 0);
            }
            if (i2 != i3) {
                m14336e(i3, 2);
                return;
            }
            return;
        }
        if (i == 2) {
            if (i2 != sizeByLoadType) {
                m14336e(sizeByLoadType, 1);
            }
            if (i2 != i3) {
                m14336e(i3, 0);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final float m14338g(int i, float f) {
        return (this.f33433l.nextFloat() - 0.5f) * (f - 1.0f) * i;
    }

    /* JADX INFO: renamed from: h */
    public final int m14339h(int i, boolean z) {
        if (i == 0) {
            return z ? 2 : 1;
        }
        if (i == 1) {
            return z ? 0 : 2;
        }
        if (i != 2) {
            return 0;
        }
        return z ? 1 : 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f33429h.post(this.f33445x);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f33429h.removeCallbacks(this.f33445x);
        this.f33429h.removeCallbacks(this.f33446y);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        View viewFindViewById = FrameLayout.inflate(getContext(), R.layout.ken_burns_view, this).findViewById(R.id.ken_burns_root);
        Objects.requireNonNull(viewFindViewById, "null cannot be cast to non-null type android.widget.FrameLayout");
        this.f33432k = (FrameLayout) viewFindViewById;
    }

    public final void setPager(LoopViewPager loopViewPager) {
        this.f33443v = loopViewPager;
    }

    public final void setScaleType(ImageView.ScaleType scaleType) {
        this.f33444w = scaleType;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KenBurnsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics2.m13089e(context, "context");
        this.f33428g = 1;
        this.f33429h = new Handler();
        this.f33430i = context;
        this.f33433l = new Random();
        this.f33434m = 6500;
        this.f33435n = 2000;
        this.f33436o = 1.5f;
        this.f33437p = 1.0f;
        this.f33439r = -1;
        this.f33440s = new ArrayList<>();
        this.f33441t = new ArrayList<>();
        this.f33442u = new ArrayList<>();
        this.f33445x = new RunnableC7237c();
        this.f33446y = new RunnableC7236b();
    }
}
