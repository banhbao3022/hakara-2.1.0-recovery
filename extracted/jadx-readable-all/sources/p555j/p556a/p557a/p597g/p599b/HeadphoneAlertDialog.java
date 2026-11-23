package p555j.p556a.p557a.p597g.p599b;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Objects;
import mtp.media.karaoke.R;
import p636z0.p644b.p645c.AlertDialog;

/* JADX INFO: renamed from: j.a.a.g.b.d, reason: use source file name */
/* JADX INFO: compiled from: HeadphoneAlertDialog.java */
/* JADX INFO: loaded from: classes.dex */
public class HeadphoneAlertDialog extends AlertDialog implements View.OnClickListener {

    /* JADX INFO: renamed from: A */
    public String f32105A;

    /* JADX INFO: renamed from: B */
    public boolean f32106B;

    /* JADX INFO: renamed from: C */
    public boolean f32107C;

    /* JADX INFO: renamed from: D */
    public boolean f32108D;

    /* JADX INFO: renamed from: E */
    public FrameLayout f32109E;

    /* JADX INFO: renamed from: F */
    public FrameLayout f32110F;

    /* JADX INFO: renamed from: G */
    public FrameLayout f32111G;

    /* JADX INFO: renamed from: H */
    public FrameLayout f32112H;

    /* JADX INFO: renamed from: I */
    public int f32113I;

    /* JADX INFO: renamed from: J */
    public EditText f32114J;

    /* JADX INFO: renamed from: f */
    public final AnimationSet f32115f;

    /* JADX INFO: renamed from: g */
    public final AnimationSet f32116g;

    /* JADX INFO: renamed from: h */
    public final AnimationSet f32117h;

    /* JADX INFO: renamed from: i */
    public final Animation f32118i;

    /* JADX INFO: renamed from: j */
    public final Animation f32119j;

    /* JADX INFO: renamed from: k */
    public TextView f32120k;

    /* JADX INFO: renamed from: l */
    public TextView f32121l;

    /* JADX INFO: renamed from: m */
    public ImageView f32122m;

    /* JADX INFO: renamed from: n */
    public ImageView f32123n;

    /* JADX INFO: renamed from: o */
    public ImageView f32124o;

    /* JADX INFO: renamed from: p */
    public Drawable f32125p;

    /* JADX INFO: renamed from: q */
    public TextView f32126q;

    /* JADX INFO: renamed from: r */
    public Button f32127r;

    /* JADX INFO: renamed from: s */
    public Drawable f32128s;

    /* JADX INFO: renamed from: t */
    public Drawable f32129t;

    /* JADX INFO: renamed from: u */
    public View f32130u;

    /* JADX INFO: renamed from: v */
    public View f32131v;

    /* JADX INFO: renamed from: w */
    public FrameLayout f32132w;

    /* JADX INFO: renamed from: x */
    public String f32133x;

    /* JADX INFO: renamed from: y */
    public String f32134y;

    /* JADX INFO: renamed from: z */
    public String f32135z;

    /* JADX INFO: renamed from: j.a.a.g.b.d$a */
    /* JADX INFO: compiled from: HeadphoneAlertDialog.java */
    public class a implements Animation.AnimationListener {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            HeadphoneAlertDialog.this.f32130u.setVisibility(8);
            HeadphoneAlertDialog.this.f32130u.post(new Runnable() { // from class: j.a.a.g.b.a
                @Override // java.lang.Runnable
                public final void run() {
                    HeadphoneAlertDialog headphoneAlertDialog = HeadphoneAlertDialog.this;
                    if (headphoneAlertDialog.f32107C) {
                        super/*android.app.Dialog*/.cancel();
                    } else {
                        super/*z0.b.c.p*/.dismiss();
                    }
                }
            });
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: renamed from: j.a.a.g.b.d$b */
    /* JADX INFO: compiled from: HeadphoneAlertDialog.java */
    public class b extends Animation {
        public b() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            Window window = HeadphoneAlertDialog.this.getWindow();
            Objects.requireNonNull(window);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.alpha = 1.0f - f;
            HeadphoneAlertDialog.this.getWindow().setAttributes(attributes);
        }
    }

    public HeadphoneAlertDialog(Context context) {
        this(context, 0);
    }

    /* JADX INFO: renamed from: c */
    public final HeadphoneAlertDialog m14002c(Drawable drawable) {
        this.f32128s = drawable;
        TextView textView = this.f32126q;
        if (textView != null && drawable != null) {
            textView.setBackground(drawable);
        }
        return this;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        this.f32107C = true;
        this.f32126q.startAnimation(this.f32118i);
        this.f32130u.startAnimation(this.f32116g);
    }

    /* JADX INFO: renamed from: d */
    public HeadphoneAlertDialog m14003d(String str) {
        this.f32105A = str;
        TextView textView = this.f32126q;
        if (textView != null && str != null) {
            this.f32108D = true;
            if (textView != null) {
                textView.setVisibility(0);
            }
            this.f32126q.setText(this.f32105A);
        }
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final HeadphoneAlertDialog m14004e(Drawable drawable) {
        this.f32125p = drawable;
        ImageView imageView = this.f32124o;
        if (imageView != null && drawable != null) {
            imageView.setVisibility(0);
            this.f32124o.setImageDrawable(this.f32125p);
        }
        return this;
    }

    /* JADX INFO: renamed from: f */
    public HeadphoneAlertDialog m14005f(String str) {
        this.f32133x = str;
        TextView textView = this.f32120k;
        if (textView != null && str != null) {
            textView.setVisibility(0);
            this.f32121l.setAutoLinkMask(15);
            if (Build.VERSION.SDK_INT >= 24) {
                this.f32120k.setText(Html.fromHtml(this.f32133x, 1));
            } else {
                this.f32120k.setText(Html.fromHtml(this.f32133x));
            }
        }
        return this;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.cancel_button) {
            this.f32107C = false;
            this.f32126q.startAnimation(this.f32118i);
            this.f32130u.startAnimation(this.f32116g);
        } else if (view.getId() == R.id.custom_confirm_button) {
            this.f32107C = false;
            this.f32126q.startAnimation(this.f32118i);
            this.f32130u.startAnimation(this.f32116g);
        }
    }

    @Override // p636z0.p644b.p645c.AlertDialog, p636z0.p644b.p645c.AppCompatDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        FrameLayout frameLayout;
        super.onCreate(bundle);
        setContentView(R.layout.popup_headphone_alert_dialog);
        Window window = getWindow();
        Objects.requireNonNull(window);
        this.f32130u = window.getDecorView().findViewById(android.R.id.content);
        this.f32120k = (TextView) findViewById(R.id.title_text);
        this.f32121l = (TextView) findViewById(R.id.content_text);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.error_frame);
        this.f32109E = frameLayout2;
        this.f32122m = (ImageView) frameLayout2.findViewById(R.id.error_x);
        this.f32114J = (EditText) findViewById(R.id.edit_text);
        this.f32110F = (FrameLayout) findViewById(R.id.success_frame);
        this.f32111G = (FrameLayout) findViewById(R.id.progress_dialog);
        this.f32123n = (ImageView) this.f32110F.findViewById(R.id.success_x);
        this.f32124o = (ImageView) findViewById(R.id.custom_image);
        this.f32112H = (FrameLayout) findViewById(R.id.warning_frame);
        this.f32132w = (FrameLayout) findViewById(R.id.custom_view_container);
        this.f32126q = (TextView) findViewById(R.id.custom_confirm_button);
        this.f32127r = (Button) findViewById(R.id.cancel_button);
        this.f32126q.setOnClickListener(this);
        this.f32127r.setOnClickListener(this);
        View view = this.f32131v;
        this.f32131v = view;
        if (view != null && (frameLayout = this.f32132w) != null) {
            frameLayout.addView(view);
            this.f32132w.setVisibility(0);
        }
        m14005f(this.f32133x);
        String str = this.f32134y;
        this.f32134y = str;
        TextView textView = this.f32121l;
        if (textView != null && str != null) {
            textView.setVisibility(0);
            this.f32121l.setAutoLinkMask(15);
            if (Build.VERSION.SDK_INT >= 24) {
                this.f32121l.setText(Html.fromHtml(this.f32134y, 0));
            } else {
                this.f32121l.setText(Html.fromHtml(this.f32134y));
            }
            this.f32132w.setVisibility(8);
        }
        String str2 = this.f32135z;
        this.f32135z = str2;
        Button button = this.f32127r;
        if (button != null && str2 != null) {
            this.f32106B = true;
            button.setVisibility(0);
            this.f32127r.setText(this.f32135z);
        }
        m14003d(this.f32105A);
        m14002c(this.f32128s);
        Drawable drawable = this.f32129t;
        this.f32129t = drawable;
        Button button2 = this.f32127r;
        if (button2 != null && drawable != null) {
            button2.setBackground(drawable);
        }
        int i = this.f32113I;
        this.f32113I = i;
        if (this.f32130u != null) {
            switch (i) {
                case 1:
                    this.f32109E.setVisibility(0);
                    m14002c(this.f32128s);
                    break;
                case 2:
                    this.f32110F.setVisibility(0);
                    m14002c(this.f32128s);
                    break;
                case 3:
                    this.f32112H.setVisibility(0);
                    m14002c(this.f32128s);
                    break;
                case 4:
                    m14004e(this.f32125p);
                    m14002c(this.f32128s);
                    break;
                case 5:
                    this.f32111G.setVisibility(0);
                    this.f32126q.setVisibility(8);
                    m14002c(this.f32128s);
                    break;
                case 6:
                    this.f32114J.requestFocus();
                    m14002c(this.f32128s);
                    break;
            }
        }
    }

    @Override // android.app.Dialog
    public void onStart() {
        this.f32130u.startAnimation(this.f32115f);
        playAnimation();
    }

    public final void playAnimation() {
        int i = this.f32113I;
        if (i == 1) {
            this.f32109E.startAnimation(this.f32119j);
            this.f32122m.startAnimation(this.f32117h);
        } else if (i == 2) {
            this.f32123n.startAnimation(this.f32119j);
            this.f32110F.startAnimation(this.f32119j);
        }
    }

    public HeadphoneAlertDialog(Context context, int i) {
        super(context, R.style.alert_dialog_dark);
        setCancelable(true);
        setCanceledOnTouchOutside(false);
        this.f32113I = i;
        this.f32119j = AnimationLoader2.m13999b(getContext(), R.anim.error_frame_in);
        this.f32117h = (AnimationSet) AnimationLoader2.m13999b(getContext(), R.anim.error_x_in);
        this.f32115f = (AnimationSet) AnimationLoader2.m13999b(getContext(), R.anim.modal_in);
        AnimationSet animationSet = (AnimationSet) AnimationLoader2.m13999b(getContext(), R.anim.modal_out);
        this.f32116g = animationSet;
        Objects.requireNonNull(animationSet);
        animationSet.setAnimationListener(new a());
        b bVar = new b();
        this.f32118i = bVar;
        bVar.setDuration(120L);
        Window window = getWindow();
        Objects.requireNonNull(window);
        window.setSoftInputMode(3);
    }
}
