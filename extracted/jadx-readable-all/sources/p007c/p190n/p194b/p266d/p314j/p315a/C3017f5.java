package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2253d;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;

/* JADX INFO: renamed from: c.n.b.d.j.a.f5 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3017f5 extends RelativeLayout {

    /* JADX INFO: renamed from: f */
    public static final float[] f13785f = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};

    /* JADX INFO: renamed from: g */
    public AnimationDrawable f13786g;

    public C3017f5(Context context, BinderC2980e5 binderC2980e5, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        Objects.requireNonNull(binderC2980e5, "null reference");
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(f13785f, null, null));
        shapeDrawable.getPaint().setColor(binderC2980e5.f13500m);
        setLayoutParams(layoutParams);
        C2253d c2253d = C2330u.f10884a.f10891f;
        setBackground(shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(binderC2980e5.f13497j)) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(binderC2980e5.f13497j);
            textView.setTextColor(binderC2980e5.f13501n);
            textView.setTextSize(binderC2980e5.f13502o);
            gx2 gx2Var = gx2.f14692a;
            C3331nn c3331nn = gx2Var.f14693b;
            int iM7886d = C3331nn.m7886d(context.getResources().getDisplayMetrics(), 4);
            C3331nn c3331nn2 = gx2Var.f14693b;
            textView.setPadding(iM7886d, 0, C3331nn.m7886d(context.getResources().getDisplayMetrics(), 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List<BinderC3091h5> list = binderC2980e5.f13498k;
        if (list != null && list.size() > 1) {
            this.f13786g = new AnimationDrawable();
            Iterator<BinderC3091h5> it = list.iterator();
            while (it.hasNext()) {
                try {
                    this.f13786g.addFrame((Drawable) BinderC2800b.m5639T1(it.next().mo7056a()), binderC2980e5.f13503p);
                } catch (Exception e) {
                    C2622l.m5438t3("Error while getting drawable.", e);
                }
            }
            C2253d c2253d2 = C2330u.f10884a.f10891f;
            imageView.setBackground(this.f13786g);
        } else if (list.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) BinderC2800b.m5639T1(list.get(0).mo7056a()));
            } catch (Exception e2) {
                C2622l.m5438t3("Error while getting drawable.", e2);
            }
        }
        addView(imageView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.f13786g;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
