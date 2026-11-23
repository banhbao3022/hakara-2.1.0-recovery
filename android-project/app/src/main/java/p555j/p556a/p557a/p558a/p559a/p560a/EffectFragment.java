package p555j.p556a.p557a.p558a.p559a.p560a;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.HashMap;
import java.util.Objects;
import mtp.media.karaoke.R;
import mtp.media.karaoke.addon.seekbar.StartPointSeekBar;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p334e.p348i.BottomSheetDialogFragment;
import p007c.p190n.p430e.GsonBuilder;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p606h.p609c.p612c.ModelPrefs;

/* JADX INFO: renamed from: j.a.a.a.a.a.a, reason: use source file name */
/* JADX INFO: compiled from: EffectFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class EffectFragment extends BottomSheetDialogFragment {

    /* JADX INFO: renamed from: s0 */
    public static final b f30959s0 = new b(null);

    /* JADX INFO: renamed from: t0 */
    public c f30960t0;

    /* JADX INFO: renamed from: u0 */
    public boolean f30961u0;

    /* JADX INFO: renamed from: v0 */
    public boolean f30962v0;

    /* JADX INFO: renamed from: w0 */
    public int f30963w0;

    /* JADX INFO: renamed from: x0 */
    public int f30964x0;

    /* JADX INFO: renamed from: y0 */
    public HashMap f30965y0;

    /* JADX INFO: renamed from: j.a.a.a.a.a.a$a */
    /* JADX INFO: compiled from: java-style lambda group */
    /* JADX INFO: loaded from: classes.dex */
    public static final class a implements View.OnClickListener {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f30966f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ Object f30967g;

        public a(int i, Object obj) {
            this.f30966f = i;
            this.f30967g = obj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = this.f30966f;
            if (i == 0) {
                ((EffectFragment) this.f30967g).mo11126W0();
                return;
            }
            if (i == 1) {
                EffectFragment effectFragment = (EffectFragment) this.f30967g;
                c cVar = effectFragment.f30960t0;
                if (cVar != null) {
                    RadioGroup radioGroup = (RadioGroup) effectFragment.m13869d1(R.id.rgEffect);
                    Intrinsics2.m13088d(radioGroup, "rgEffect");
                    cVar.mo13874w(radioGroup.getCheckedRadioButtonId());
                }
                RadioGroup radioGroup2 = (RadioGroup) ((EffectFragment) this.f30967g).m13869d1(R.id.rgEffect);
                Intrinsics2.m13088d(radioGroup2, "rgEffect");
                if (radioGroup2.getCheckedRadioButtonId() == R.id.rbCustom) {
                    EffectFragment effectFragment2 = (EffectFragment) this.f30967g;
                    if (effectFragment2.f30961u0) {
                        ((RelativeLayout) effectFragment2.m13869d1(R.id.layoutEffectCustom)).setBackgroundColor(-16777216);
                        RelativeLayout relativeLayout = (RelativeLayout) ((EffectFragment) this.f30967g).m13869d1(R.id.layoutEffectCustom);
                        Intrinsics2.m13088d(relativeLayout, "layoutEffectCustom");
                        SkuDao.a.m14068T(relativeLayout);
                        EffectFragment effectFragment3 = (EffectFragment) this.f30967g;
                        c cVar2 = effectFragment3.f30960t0;
                        if (cVar2 != null) {
                            SeekBar seekBar = (SeekBar) effectFragment3.m13869d1(R.id.seekBarReverb);
                            Intrinsics2.m13088d(seekBar, "seekBarReverb");
                            int progress = seekBar.getProgress();
                            SeekBar seekBar2 = (SeekBar) ((EffectFragment) this.f30967g).m13869d1(R.id.seekBarRoomSize);
                            Intrinsics2.m13088d(seekBar2, "seekBarRoomSize");
                            cVar2.mo13873v(progress, seekBar2.getProgress());
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (i == 2) {
                RelativeLayout relativeLayout2 = (RelativeLayout) ((EffectFragment) this.f30967g).m13869d1(R.id.layoutEffectCustom);
                Intrinsics2.m13088d(relativeLayout2, "layoutEffectCustom");
                SkuDao.a.m14109v(relativeLayout2);
                return;
            }
            if (i == 3) {
                EffectFragment effectFragment4 = (EffectFragment) this.f30967g;
                if (effectFragment4.f30961u0) {
                    int i2 = effectFragment4.f30964x0;
                    if (i2 > -12) {
                        effectFragment4.f30964x0 = i2 - 1;
                        ((StartPointSeekBar) effectFragment4.m13869d1(R.id.toneOrRhythmSeekBar)).setProgress(((EffectFragment) this.f30967g).f30964x0);
                        TextView textView = (TextView) ((EffectFragment) this.f30967g).m13869d1(R.id.lblToneValue);
                        Intrinsics2.m13088d(textView, "lblToneValue");
                        textView.setText(String.valueOf(((EffectFragment) this.f30967g).f30964x0));
                    }
                } else {
                    int i3 = effectFragment4.f30964x0;
                    if (i3 > -1200) {
                        if (i3 <= -30 || i3 >= 30 || i3 == 0) {
                            effectFragment4.f30964x0 = i3 - 30;
                        } else {
                            effectFragment4.f30964x0 = 0;
                        }
                        ((StartPointSeekBar) effectFragment4.m13869d1(R.id.toneOrRhythmSeekBar)).setProgress(((EffectFragment) this.f30967g).f30964x0);
                        ((EffectFragment) this.f30967g).m13870e1();
                    }
                }
                EffectFragment effectFragment5 = (EffectFragment) this.f30967g;
                c cVar3 = effectFragment5.f30960t0;
                if (cVar3 != null) {
                    cVar3.mo13872e(effectFragment5.f30964x0);
                    return;
                }
                return;
            }
            if (i != 4) {
                throw null;
            }
            EffectFragment effectFragment6 = (EffectFragment) this.f30967g;
            if (effectFragment6.f30961u0) {
                int i4 = effectFragment6.f30964x0;
                if (i4 < 12) {
                    effectFragment6.f30964x0 = i4 + 1;
                    ((StartPointSeekBar) effectFragment6.m13869d1(R.id.toneOrRhythmSeekBar)).setProgress(((EffectFragment) this.f30967g).f30964x0);
                    TextView textView2 = (TextView) ((EffectFragment) this.f30967g).m13869d1(R.id.lblToneValue);
                    Intrinsics2.m13088d(textView2, "lblToneValue");
                    textView2.setText(String.valueOf(((EffectFragment) this.f30967g).f30964x0));
                }
            } else {
                int i5 = effectFragment6.f30964x0;
                if (i5 < 1200) {
                    if (i5 <= -30 || i5 >= 30 || i5 == 0) {
                        effectFragment6.f30964x0 = i5 + 30;
                    } else {
                        effectFragment6.f30964x0 = 0;
                    }
                    ((StartPointSeekBar) effectFragment6.m13869d1(R.id.toneOrRhythmSeekBar)).setProgress(((EffectFragment) this.f30967g).f30964x0);
                    ((EffectFragment) this.f30967g).m13870e1();
                }
            }
            EffectFragment effectFragment7 = (EffectFragment) this.f30967g;
            c cVar4 = effectFragment7.f30960t0;
            if (cVar4 != null) {
                cVar4.mo13872e(effectFragment7.f30964x0);
            }
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.a.a$b */
    /* JADX INFO: compiled from: EffectFragment.kt */
    public static final class b {
        public b() {
        }

        /* JADX INFO: renamed from: a */
        public static EffectFragment m13871a(b bVar, boolean z, int i, int i2, boolean z2, int i3) {
            if ((i3 & 1) != 0) {
                z = false;
            }
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = 0;
            }
            if ((i3 & 8) != 0) {
                z2 = false;
            }
            Objects.requireNonNull(bVar);
            EffectFragment effectFragment = new EffectFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("is_sing", z);
            bundle.putBoolean("is_video", z2);
            bundle.putInt("current_tone", i2);
            bundle.putInt("effect_checked_draft", i);
            effectFragment.m16540M0(bundle);
            return effectFragment;
        }

        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.a.a$c */
    /* JADX INFO: compiled from: EffectFragment.kt */
    public interface c {
        /* JADX INFO: renamed from: e */
        void mo13872e(int i);

        /* JADX INFO: renamed from: v */
        void mo13873v(int i, int i2);

        /* JADX INFO: renamed from: w */
        void mo13874w(int i);
    }

    /* JADX INFO: renamed from: j.a.a.a.a.a.a$d */
    /* JADX INFO: compiled from: EffectFragment.kt */
    public static final class d implements RadioGroup.OnCheckedChangeListener {
        public d() {
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public final void onCheckedChanged(RadioGroup radioGroup, int i) {
            RadioButton radioButton = (RadioButton) radioGroup.findViewById(i);
            Intrinsics2.m13088d(radioButton, "checkedRadioButton");
            if (radioButton.isChecked()) {
                Integer numValueOf = Integer.valueOf(radioButton.getId());
                Intrinsics2.m13089e("effect", "key");
                String strM12319f = new GsonBuilder().m12322a().m12319f(numValueOf);
                SharedPreferences sharedPreferences = ModelPrefs.f32358a;
                if (sharedPreferences == null) {
                    Intrinsics2.m13096l("preferences");
                    throw null;
                }
                outline.m1564O(sharedPreferences, "effect", strM12319f);
                c cVar = EffectFragment.this.f30960t0;
                if (cVar != null) {
                    cVar.mo13874w(radioButton.getId());
                }
            }
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.a.a$e */
    /* JADX INFO: compiled from: EffectFragment.kt */
    public static final class e implements StartPointSeekBar.InterfaceC7238a {
        public e() {
        }

        @Override // mtp.media.karaoke.addon.seekbar.StartPointSeekBar.InterfaceC7238a
        /* JADX INFO: renamed from: a */
        public final void mo13875a(StartPointSeekBar startPointSeekBar, double d, boolean z) {
            EffectFragment effectFragment;
            c cVar;
            EffectFragment effectFragment2 = EffectFragment.this;
            effectFragment2.f30964x0 = (int) d;
            TextView textView = (TextView) effectFragment2.m13869d1(R.id.lblToneValue);
            Intrinsics2.m13088d(textView, "lblToneValue");
            textView.setText(String.valueOf(EffectFragment.this.f30964x0));
            EffectFragment.this.m13870e1();
            if (!z || (cVar = (effectFragment = EffectFragment.this).f30960t0) == null) {
                return;
            }
            cVar.mo13872e(effectFragment.f30964x0);
        }
    }

    @Override // p636z0.p752p.p753c.DialogFragment
    /* JADX INFO: renamed from: Y0 */
    public int mo13868Y0() {
        return R.style.AppBottomSheetDialogThemeSing;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p636z0.p752p.p753c.DialogFragment, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: Z */
    public void mo463Z(Context context) {
        Intrinsics2.m13089e(context, "context");
        super.mo463Z(context);
        if (context instanceof c) {
            this.f30960t0 = (c) context;
            return;
        }
        throw new RuntimeException(context + " must implement OnFragmentInteractionListener");
    }

    @Override // p636z0.p752p.p753c.DialogFragment, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: c0 */
    public void mo465c0(Bundle bundle) {
        super.mo465c0(bundle);
        Bundle bundle2 = this.f38438m;
        if (bundle2 != null) {
            this.f30961u0 = bundle2.getBoolean("is_sing");
            this.f30962v0 = bundle2.getBoolean("is_video");
            this.f30963w0 = bundle2.getInt("effect_checked_draft");
            this.f30964x0 = bundle2.getInt("current_tone");
        }
    }

    /* JADX INFO: renamed from: d1 */
    public View m13869d1(int i) {
        if (this.f30965y0 == null) {
            this.f30965y0 = new HashMap();
        }
        View view = (View) this.f30965y0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = this.f38416M;
        if (view2 == null) {
            return null;
        }
        View viewFindViewById = view2.findViewById(i);
        this.f30965y0.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    /* JADX INFO: renamed from: e1 */
    public final void m13870e1() {
        int i = this.f30964x0;
        if (i > 0) {
            TextView textView = (TextView) m13869d1(R.id.lblRhythm);
            Intrinsics2.m13088d(textView, "lblRhythm");
            String strM16546Q = m16546Q(R.string.message_rhythm_tuned_go_ahead);
            Intrinsics2.m13088d(strM16546Q, "getString(R.string.message_rhythm_tuned_go_ahead)");
            outline.m1574Y(new Object[]{String.valueOf(this.f30964x0)}, 1, strM16546Q, "java.lang.String.format(format, *args)", textView);
            return;
        }
        if (i >= 0) {
            TextView textView2 = (TextView) m13869d1(R.id.lblRhythm);
            Intrinsics2.m13088d(textView2, "lblRhythm");
            textView2.setText(m16546Q(R.string.message_rhythm_default));
        } else {
            TextView textView3 = (TextView) m13869d1(R.id.lblRhythm);
            Intrinsics2.m13088d(textView3, "lblRhythm");
            String strM16546Q2 = m16546Q(R.string.message_rhythm_tuned_after);
            Intrinsics2.m13088d(strM16546Q2, "getString(R.string.message_rhythm_tuned_after)");
            outline.m1574Y(new Object[]{String.valueOf(this.f30964x0)}, 1, strM16546Q2, "java.lang.String.format(format, *args)", textView3);
        }
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: f0 */
    public View mo466f0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics2.m13089e(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_effect, viewGroup, false);
    }

    @Override // p636z0.p752p.p753c.DialogFragment, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: h0 */
    public void mo467h0() {
        super.mo467h0();
        HashMap map = this.f30965y0;
        if (map != null) {
            map.clear();
        }
    }

    @Override // p636z0.p752p.p753c.DialogFragment, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: i0 */
    public void mo1957i0() {
        super.mo1957i0();
        this.f30960t0 = null;
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: w0 */
    public void mo471w0(View view, Bundle bundle) {
        Intrinsics2.m13089e(view, "view");
        if (this.f30961u0) {
            ((ImageButton) m13869d1(R.id.btnEffectClose)).setOnClickListener(new a(0, this));
        } else {
            ImageButton imageButton = (ImageButton) m13869d1(R.id.btnEffectClose);
            Intrinsics2.m13088d(imageButton, "btnEffectClose");
            SkuDao.a.m14061M(imageButton);
        }
        if (this.f30962v0) {
            ConstraintLayout constraintLayout = (ConstraintLayout) m13869d1(R.id.toneLayout);
            Intrinsics2.m13088d(constraintLayout, "toneLayout");
            SkuDao.a.m14061M(constraintLayout);
            TextView textView = (TextView) m13869d1(R.id.lblRhythm);
            Intrinsics2.m13088d(textView, "lblRhythm");
            SkuDao.a.m14061M(textView);
            TextView textView2 = (TextView) m13869d1(R.id.effectTitle);
            Intrinsics2.m13088d(textView2, "effectTitle");
            SkuDao.a.m14061M(textView2);
            TextView textView3 = (TextView) m13869d1(R.id.toneOrRhythmTitle);
            Intrinsics2.m13088d(textView3, "toneOrRhythmTitle");
            SkuDao.a.m14061M(textView3);
        }
        int iIntValue = this.f30963w0;
        if (iIntValue <= 0) {
            SharedPreferences sharedPreferences = ModelPrefs.f32358a;
            if (sharedPreferences == null) {
                Intrinsics2.m13096l("preferences");
                throw null;
            }
            Integer num = (Integer) outline.m1584f(sharedPreferences.getString("effect", null), Integer.class);
            iIntValue = num != null ? num.intValue() : R.id.rbStudio;
        }
        ((RadioGroup) m13869d1(R.id.rgEffect)).check(iIntValue);
        ((RadioGroup) m13869d1(R.id.rgEffect)).setOnCheckedChangeListener(new d());
        ((RadioButton) m13869d1(R.id.rbCustom)).setOnClickListener(new a(1, this));
        if (this.f30961u0) {
            SharedPreferences sharedPreferences2 = ModelPrefs.f32358a;
            if (sharedPreferences2 == null) {
                Intrinsics2.m13096l("preferences");
                throw null;
            }
            Integer num2 = (Integer) outline.m1584f(sharedPreferences2.getString("reverb_mix", null), Integer.class);
            int iIntValue2 = num2 != null ? num2.intValue() : 38;
            SharedPreferences sharedPreferences3 = ModelPrefs.f32358a;
            if (sharedPreferences3 == null) {
                Intrinsics2.m13096l("preferences");
                throw null;
            }
            Integer num3 = (Integer) outline.m1584f(sharedPreferences3.getString("reverb_room_size", null), Integer.class);
            int iIntValue3 = num3 != null ? num3.intValue() : 70;
            SeekBar seekBar = (SeekBar) m13869d1(R.id.seekBarReverb);
            Intrinsics2.m13088d(seekBar, "seekBarReverb");
            seekBar.setProgress(iIntValue2);
            SeekBar seekBar2 = (SeekBar) m13869d1(R.id.seekBarRoomSize);
            Intrinsics2.m13088d(seekBar2, "seekBarRoomSize");
            seekBar2.setProgress(iIntValue3);
            TextView textView4 = (TextView) m13869d1(R.id.txtNumberReverb);
            Intrinsics2.m13088d(textView4, "txtNumberReverb");
            SeekBar seekBar3 = (SeekBar) m13869d1(R.id.seekBarReverb);
            Intrinsics2.m13088d(seekBar3, "seekBarReverb");
            textView4.setText(String.valueOf(seekBar3.getProgress()));
            TextView textView5 = (TextView) m13869d1(R.id.txtNumberRoomSize);
            Intrinsics2.m13088d(textView5, "txtNumberRoomSize");
            SeekBar seekBar4 = (SeekBar) m13869d1(R.id.seekBarRoomSize);
            Intrinsics2.m13088d(seekBar4, "seekBarRoomSize");
            textView5.setText(String.valueOf(seekBar4.getProgress()));
            ((SeekBar) m13869d1(R.id.seekBarReverb)).setOnSeekBarChangeListener(new EffectFragment2(this));
            ((SeekBar) m13869d1(R.id.seekBarRoomSize)).setOnSeekBarChangeListener(new EffectFragment3(this));
            ((ImageButton) m13869d1(R.id.btnEffectCustomClose)).setOnClickListener(new a(2, this));
        } else {
            RelativeLayout relativeLayout = (RelativeLayout) m13869d1(R.id.layoutEffectCustom);
            Intrinsics2.m13088d(relativeLayout, "layoutEffectCustom");
            SkuDao.a.m14061M(relativeLayout);
        }
        if (this.f30961u0) {
            TextView textView6 = (TextView) m13869d1(R.id.lblRhythm);
            Intrinsics2.m13088d(textView6, "lblRhythm");
            SkuDao.a.m14061M(textView6);
            TextView textView7 = (TextView) m13869d1(R.id.toneOrRhythmTitle);
            Intrinsics2.m13088d(textView7, "toneOrRhythmTitle");
            textView7.setText(m16546Q(R.string.text_tone));
            TextView textView8 = (TextView) m13869d1(R.id.lblToneValue);
            Intrinsics2.m13088d(textView8, "lblToneValue");
            textView8.setText(String.valueOf(this.f30964x0));
            StartPointSeekBar startPointSeekBar = (StartPointSeekBar) m13869d1(R.id.toneOrRhythmSeekBar);
            startPointSeekBar.f33452h = -12.0d;
            startPointSeekBar.f33453i = 12.0d;
        } else {
            TextView textView9 = (TextView) m13869d1(R.id.lblToneValue);
            Intrinsics2.m13088d(textView9, "lblToneValue");
            SkuDao.a.m14109v(textView9);
            m13870e1();
            TextView textView10 = (TextView) m13869d1(R.id.toneOrRhythmTitle);
            Intrinsics2.m13088d(textView10, "toneOrRhythmTitle");
            textView10.setText(m16546Q(R.string.text_edit_rhythm));
            StartPointSeekBar startPointSeekBar2 = (StartPointSeekBar) m13869d1(R.id.toneOrRhythmSeekBar);
            startPointSeekBar2.f33452h = -1200.0d;
            startPointSeekBar2.f33453i = 1200.0d;
        }
        ((StartPointSeekBar) m13869d1(R.id.toneOrRhythmSeekBar)).setProgress(this.f30964x0);
        ((StartPointSeekBar) m13869d1(R.id.toneOrRhythmSeekBar)).setOnSeekBarChangeListener(new e());
        ((TextView) m13869d1(R.id.btnLeft)).setOnClickListener(new a(3, this));
        ((TextView) m13869d1(R.id.btnRight)).setOnClickListener(new a(4, this));
    }
}
