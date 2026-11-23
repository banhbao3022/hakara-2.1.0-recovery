package p007c.p190n.p194b.p334e.p338c0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import mtp.media.karaoke.R;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p194b.p334e.p337c.AnimationUtils;
import p007c.p190n.p194b.p334e.p337c.AnimatorSetCompat;
import p636z0.p725k.p739l.ViewCompat;

/* JADX INFO: renamed from: c.n.b.e.c0.n, reason: use source file name */
/* JADX INFO: compiled from: IndicatorViewController.java */
/* JADX INFO: loaded from: classes.dex */
public final class IndicatorViewController {

    /* JADX INFO: renamed from: a */
    public final Context f24867a;

    /* JADX INFO: renamed from: b */
    public final TextInputLayout f24868b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f24869c;

    /* JADX INFO: renamed from: d */
    public int f24870d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f24871e;

    /* JADX INFO: renamed from: f */
    public Animator f24872f;

    /* JADX INFO: renamed from: g */
    public final float f24873g;

    /* JADX INFO: renamed from: h */
    public int f24874h;

    /* JADX INFO: renamed from: i */
    public int f24875i;

    /* JADX INFO: renamed from: j */
    public CharSequence f24876j;

    /* JADX INFO: renamed from: k */
    public boolean f24877k;

    /* JADX INFO: renamed from: l */
    public TextView f24878l;

    /* JADX INFO: renamed from: m */
    public CharSequence f24879m;

    /* JADX INFO: renamed from: n */
    public int f24880n;

    /* JADX INFO: renamed from: o */
    public ColorStateList f24881o;

    /* JADX INFO: renamed from: p */
    public CharSequence f24882p;

    /* JADX INFO: renamed from: q */
    public boolean f24883q;

    /* JADX INFO: renamed from: r */
    public TextView f24884r;

    /* JADX INFO: renamed from: s */
    public int f24885s;

    /* JADX INFO: renamed from: t */
    public ColorStateList f24886t;

    /* JADX INFO: renamed from: u */
    public Typeface f24887u;

    /* JADX INFO: renamed from: c.n.b.e.c0.n$a */
    /* JADX INFO: compiled from: IndicatorViewController.java */
    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f24888a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ TextView f24889b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f24890c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ TextView f24891d;

        public a(int i, TextView textView, int i2, TextView textView2) {
            this.f24888a = i;
            this.f24889b = textView;
            this.f24890c = i2;
            this.f24891d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            TextView textView;
            IndicatorViewController indicatorViewController = IndicatorViewController.this;
            indicatorViewController.f24874h = this.f24888a;
            indicatorViewController.f24872f = null;
            TextView textView2 = this.f24889b;
            if (textView2 != null) {
                textView2.setVisibility(4);
                if (this.f24890c == 1 && (textView = IndicatorViewController.this.f24878l) != null) {
                    textView.setText((CharSequence) null);
                }
            }
            TextView textView3 = this.f24891d;
            if (textView3 != null) {
                textView3.setTranslationY(0.0f);
                this.f24891d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f24891d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public IndicatorViewController(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f24867a = context;
        this.f24868b = textInputLayout;
        this.f24873g = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
    }

    /* JADX INFO: renamed from: a */
    public void m11057a(TextView textView, int i) {
        if (this.f24869c == null && this.f24871e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f24867a);
            this.f24869c = linearLayout;
            linearLayout.setOrientation(0);
            this.f24868b.addView(this.f24869c, -1, -2);
            this.f24871e = new FrameLayout(this.f24867a);
            this.f24869c.addView(this.f24871e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f24868b.getEditText() != null) {
                m11058b();
            }
        }
        if (i == 0 || i == 1) {
            this.f24871e.setVisibility(0);
            this.f24871e.addView(textView);
        } else {
            this.f24869c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f24869c.setVisibility(0);
        this.f24870d++;
    }

    /* JADX INFO: renamed from: b */
    public void m11058b() {
        if ((this.f24869c == null || this.f24868b.getEditText() == null) ? false : true) {
            EditText editText = this.f24868b.getEditText();
            boolean zM10973X = C4799a.m10973X(this.f24867a);
            LinearLayout linearLayout = this.f24869c;
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            linearLayout.setPaddingRelative(m11064h(zM10973X, R.dimen.material_helper_text_font_1_3_padding_horizontal, editText.getPaddingStart()), m11064h(zM10973X, R.dimen.material_helper_text_font_1_3_padding_top, this.f24867a.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top)), m11064h(zM10973X, R.dimen.material_helper_text_font_1_3_padding_horizontal, editText.getPaddingEnd()), 0);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m11059c() {
        Animator animator = this.f24872f;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m11060d(List<Animator> list, boolean z, TextView textView, int i, int i2, int i3) {
        if (textView == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, i3 == i ? 1.0f : 0.0f);
            objectAnimatorOfFloat.setDuration(167L);
            objectAnimatorOfFloat.setInterpolator(AnimationUtils.f24793a);
            list.add(objectAnimatorOfFloat);
            if (i3 == i) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f24873g, 0.0f);
                objectAnimatorOfFloat2.setDuration(217L);
                objectAnimatorOfFloat2.setInterpolator(AnimationUtils.f24796d);
                list.add(objectAnimatorOfFloat2);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m11061e() {
        return (this.f24875i != 1 || this.f24878l == null || TextUtils.isEmpty(this.f24876j)) ? false : true;
    }

    /* JADX INFO: renamed from: f */
    public final TextView m11062f(int i) {
        if (i == 1) {
            return this.f24878l;
        }
        if (i != 2) {
            return null;
        }
        return this.f24884r;
    }

    /* JADX INFO: renamed from: g */
    public int m11063g() {
        TextView textView = this.f24878l;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* JADX INFO: renamed from: h */
    public final int m11064h(boolean z, int i, int i2) {
        return z ? this.f24867a.getResources().getDimensionPixelSize(i) : i2;
    }

    /* JADX INFO: renamed from: i */
    public void m11065i() {
        this.f24876j = null;
        m11059c();
        if (this.f24874h == 1) {
            if (!this.f24883q || TextUtils.isEmpty(this.f24882p)) {
                this.f24875i = 0;
            } else {
                this.f24875i = 2;
            }
        }
        m11068l(this.f24874h, this.f24875i, m11067k(this.f24878l, null));
    }

    /* JADX INFO: renamed from: j */
    public void m11066j(TextView textView, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f24869c;
        if (linearLayout == null) {
            return;
        }
        if (!(i == 0 || i == 1) || (frameLayout = this.f24871e) == null) {
            linearLayout.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i2 = this.f24870d - 1;
        this.f24870d = i2;
        LinearLayout linearLayout2 = this.f24869c;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m11067k(TextView textView, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.f24868b;
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        return textInputLayout.isLaidOut() && this.f24868b.isEnabled() && !(this.f24875i == this.f24874h && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    /* JADX INFO: renamed from: l */
    public final void m11068l(int i, int i2, boolean z) {
        TextView textViewM11062f;
        TextView textViewM11062f2;
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f24872f = animatorSet;
            ArrayList arrayList = new ArrayList();
            m11060d(arrayList, this.f24883q, this.f24884r, 2, i, i2);
            m11060d(arrayList, this.f24877k, this.f24878l, 1, i, i2);
            AnimatorSetCompat.m11032a(animatorSet, arrayList);
            animatorSet.addListener(new a(i2, m11062f(i), i, m11062f(i2)));
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (textViewM11062f2 = m11062f(i2)) != null) {
                textViewM11062f2.setVisibility(0);
                textViewM11062f2.setAlpha(1.0f);
            }
            if (i != 0 && (textViewM11062f = m11062f(i)) != null) {
                textViewM11062f.setVisibility(4);
                if (i == 1) {
                    textViewM11062f.setText((CharSequence) null);
                }
            }
            this.f24874h = i2;
        }
        this.f24868b.m12876w();
        this.f24868b.m12878y(z, false);
        this.f24868b.m12855F();
    }
}
