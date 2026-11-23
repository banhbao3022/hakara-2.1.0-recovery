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

/* JADX INFO: renamed from: j.a.a.g.b.e, reason: use source file name */
/* JADX INFO: compiled from: PAlertDialog.java */
/* JADX INFO: loaded from: classes.dex */
public class PAlertDialog extends AlertDialog implements View.OnClickListener {

    /* JADX INFO: renamed from: A */
    public String f32138A;

    /* JADX INFO: renamed from: B */
    public boolean f32139B;

    /* JADX INFO: renamed from: C */
    public boolean f32140C;

    /* JADX INFO: renamed from: D */
    public boolean f32141D;

    /* JADX INFO: renamed from: E */
    public FrameLayout f32142E;

    /* JADX INFO: renamed from: F */
    public FrameLayout f32143F;

    /* JADX INFO: renamed from: G */
    public FrameLayout f32144G;

    /* JADX INFO: renamed from: H */
    public FrameLayout f32145H;

    /* JADX INFO: renamed from: I */
    public int f32146I;

    /* JADX INFO: renamed from: J */
    public EditText f32147J;

    /* JADX INFO: renamed from: f */
    public final AnimationSet f32148f;

    /* JADX INFO: renamed from: g */
    public final AnimationSet f32149g;

    /* JADX INFO: renamed from: h */
    public final AnimationSet f32150h;

    /* JADX INFO: renamed from: i */
    public final Animation f32151i;

    /* JADX INFO: renamed from: j */
    public final Animation f32152j;

    /* JADX INFO: renamed from: k */
    public TextView f32153k;

    /* JADX INFO: renamed from: l */
    public TextView f32154l;

    /* JADX INFO: renamed from: m */
    public ImageView f32155m;

    /* JADX INFO: renamed from: n */
    public ImageView f32156n;

    /* JADX INFO: renamed from: o */
    public ImageView f32157o;

    /* JADX INFO: renamed from: p */
    public Drawable f32158p;

    /* JADX INFO: renamed from: q */
    public TextView f32159q;

    /* JADX INFO: renamed from: r */
    public Button f32160r;

    /* JADX INFO: renamed from: s */
    public Drawable f32161s;

    /* JADX INFO: renamed from: t */
    public Drawable f32162t;

    /* JADX INFO: renamed from: u */
    public View f32163u;

    /* JADX INFO: renamed from: v */
    public View f32164v;

    /* JADX INFO: renamed from: w */
    public FrameLayout f32165w;

    /* JADX INFO: renamed from: x */
    public String f32166x;

    /* JADX INFO: renamed from: y */
    public String f32167y;

    /* JADX INFO: renamed from: z */
    public String f32168z;

    /* JADX INFO: renamed from: j.a.a.g.b.e$a */
    /* JADX INFO: compiled from: PAlertDialog.java */
    public class a implements Animation.AnimationListener {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            PAlertDialog.this.f32163u.setVisibility(8);
            PAlertDialog.this.f32163u.post(new Runnable() { // from class: j.a.a.g.b.b
                @Override // java.lang.Runnable
                public final void run() {
                    PAlertDialog pAlertDialog = PAlertDialog.this;
                    if (pAlertDialog.f32140C) {
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

    /* JADX INFO: renamed from: j.a.a.g.b.e$b */
    /* JADX INFO: compiled from: PAlertDialog.java */
    public class b extends Animation {
        public b() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            Window window = PAlertDialog.this.getWindow();
            Objects.requireNonNull(window);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.alpha = 1.0f - f;
            PAlertDialog.this.getWindow().setAttributes(attributes);
        }
    }

    public PAlertDialog(Context context) {
        this(context, 0);
    }

    /* JADX INFO: renamed from: c */
    public final PAlertDialog m14008c(Drawable drawable) {
        this.f32161s = drawable;
        TextView textView = this.f32159q;
        if (textView != null && drawable != null) {
            textView.setBackground(drawable);
        }
        return this;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        this.f32140C = true;
        this.f32159q.startAnimation(this.f32151i);
        this.f32163u.startAnimation(this.f32149g);
    }

    /* JADX INFO: renamed from: d */
    public PAlertDialog m14009d(String str) {
        this.f32138A = str;
        TextView textView = this.f32159q;
        if (textView != null && str != null) {
            this.f32141D = true;
            if (textView != null) {
                textView.setVisibility(0);
            }
            this.f32159q.setText(this.f32138A);
        }
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final PAlertDialog m14010e(Drawable drawable) {
        this.f32158p = drawable;
        ImageView imageView = this.f32157o;
        if (imageView != null && drawable != null) {
            imageView.setVisibility(0);
            this.f32157o.setImageDrawable(this.f32158p);
        }
        return this;
    }

    /* JADX INFO: renamed from: f */
    public PAlertDialog m14011f(View view) {
        FrameLayout frameLayout;
        this.f32164v = view;
        if (view != null && (frameLayout = this.f32165w) != null) {
            frameLayout.addView(view);
            this.f32165w.setVisibility(0);
        }
        return this;
    }

    /* JADX INFO: renamed from: i */
    public PAlertDialog m14012i(String str) {
        this.f32166x = str;
        TextView textView = this.f32153k;
        if (textView != null && str != null) {
            textView.setVisibility(0);
            this.f32154l.setAutoLinkMask(15);
            if (Build.VERSION.SDK_INT >= 24) {
                this.f32153k.setText(Html.fromHtml(this.f32166x, 1));
            } else {
                this.f32153k.setText(Html.fromHtml(this.f32166x));
            }
        }
        return this;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.cancel_button) {
            this.f32140C = false;
            this.f32159q.startAnimation(this.f32151i);
            this.f32163u.startAnimation(this.f32149g);
        } else if (view.getId() == R.id.custom_confirm_button) {
            this.f32140C = false;
            this.f32159q.startAnimation(this.f32151i);
            this.f32163u.startAnimation(this.f32149g);
        }
    }

    @Override // p636z0.p644b.p645c.AlertDialog, p636z0.p644b.p645c.AppCompatDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.popup_alert_dialog);
        Window window = getWindow();
        Objects.requireNonNull(window);
        this.f32163u = window.getDecorView().findViewById(android.R.id.content);
        this.f32153k = (TextView) findViewById(R.id.title_text);
        this.f32154l = (TextView) findViewById(R.id.content_text);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.error_frame);
        this.f32142E = frameLayout;
        this.f32155m = (ImageView) frameLayout.findViewById(R.id.error_x);
        this.f32147J = (EditText) findViewById(R.id.edit_text);
        this.f32143F = (FrameLayout) findViewById(R.id.success_frame);
        this.f32144G = (FrameLayout) findViewById(R.id.progress_dialog);
        this.f32156n = (ImageView) this.f32143F.findViewById(R.id.success_x);
        this.f32157o = (ImageView) findViewById(R.id.custom_image);
        this.f32145H = (FrameLayout) findViewById(R.id.warning_frame);
        this.f32165w = (FrameLayout) findViewById(R.id.custom_view_container);
        this.f32159q = (TextView) findViewById(R.id.custom_confirm_button);
        this.f32160r = (Button) findViewById(R.id.cancel_button);
        this.f32159q.setOnClickListener(this);
        this.f32160r.setOnClickListener(this);
        m14011f(this.f32164v);
        m14012i(this.f32166x);
        String str = this.f32167y;
        this.f32167y = str;
        TextView textView = this.f32154l;
        if (textView != null && str != null) {
            textView.setVisibility(0);
            this.f32154l.setAutoLinkMask(15);
            if (Build.VERSION.SDK_INT >= 24) {
                this.f32154l.setText(Html.fromHtml(this.f32167y, 0));
            } else {
                this.f32154l.setText(Html.fromHtml(this.f32167y));
            }
            this.f32165w.setVisibility(8);
        }
        String str2 = this.f32168z;
        this.f32168z = str2;
        Button button = this.f32160r;
        if (button != null && str2 != null) {
            this.f32139B = true;
            button.setVisibility(0);
            this.f32160r.setText(this.f32168z);
        }
        m14009d(this.f32138A);
        m14008c(this.f32161s);
        Drawable drawable = this.f32162t;
        this.f32162t = drawable;
        Button button2 = this.f32160r;
        if (button2 != null && drawable != null) {
            button2.setBackground(drawable);
        }
        int i = this.f32146I;
        this.f32146I = i;
        if (this.f32163u != null) {
            switch (i) {
                case 1:
                    this.f32142E.setVisibility(0);
                    m14008c(this.f32161s);
                    break;
                case 2:
                    this.f32143F.setVisibility(0);
                    m14008c(this.f32161s);
                    break;
                case 3:
                    this.f32145H.setVisibility(0);
                    m14008c(this.f32161s);
                    break;
                case 4:
                    m14010e(this.f32158p);
                    m14008c(this.f32161s);
                    break;
                case 5:
                    this.f32144G.setVisibility(0);
                    this.f32159q.setVisibility(8);
                    m14008c(this.f32161s);
                    break;
                case 6:
                    this.f32147J.requestFocus();
                    m14008c(this.f32161s);
                    break;
            }
        }
    }

    @Override // android.app.Dialog
    public void onStart() {
        this.f32163u.startAnimation(this.f32148f);
        playAnimation();
    }

    public final void playAnimation() {
        int i = this.f32146I;
        if (i == 1) {
            this.f32142E.startAnimation(this.f32152j);
            this.f32155m.startAnimation(this.f32150h);
        } else if (i == 2) {
            this.f32156n.startAnimation(this.f32152j);
            this.f32143F.startAnimation(this.f32152j);
        }
    }

    public PAlertDialog(Context context, int i) {
        super(context, R.style.alert_dialog_light);
        setCancelable(true);
        setCanceledOnTouchOutside(false);
        this.f32146I = i;
        this.f32152j = AnimationLoader2.m13999b(getContext(), R.anim.error_frame_in);
        this.f32150h = (AnimationSet) AnimationLoader2.m13999b(getContext(), R.anim.error_x_in);
        this.f32148f = (AnimationSet) AnimationLoader2.m13999b(getContext(), R.anim.modal_in);
        AnimationSet animationSet = (AnimationSet) AnimationLoader2.m13999b(getContext(), R.anim.modal_out);
        this.f32149g = animationSet;
        Objects.requireNonNull(animationSet);
        animationSet.setAnimationListener(new a());
        b bVar = new b();
        this.f32151i = bVar;
        bVar.setDuration(120L);
        Window window = getWindow();
        Objects.requireNonNull(window);
        window.setSoftInputMode(3);
    }
}
