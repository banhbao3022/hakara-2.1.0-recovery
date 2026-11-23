package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import mtp.media.karaoke.R;
import p007c.p190n.p194b.p334e.p343e0.TimePickerView2;
import p007c.p190n.p194b.p334e.p343e0.TimePickerView3;
import p636z0.p697i.p703c.ConstraintSet;
import p636z0.p725k.p739l.ViewCompat;

/* JADX INFO: loaded from: classes.dex */
public class TimePickerView extends ConstraintLayout {

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ int f29234y = 0;

    /* JADX INFO: renamed from: A */
    public final Chip f29235A;

    /* JADX INFO: renamed from: B */
    public final MaterialButtonToggleGroup f29236B;

    /* JADX INFO: renamed from: C */
    public final View.OnClickListener f29237C;

    /* JADX INFO: renamed from: z */
    public final Chip f29238z;

    /* JADX INFO: renamed from: com.google.android.material.timepicker.TimePickerView$a */
    public class ViewOnClickListenerC5988a implements View.OnClickListener {
        public ViewOnClickListenerC5988a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TimePickerView timePickerView = TimePickerView.this;
            int i = TimePickerView.f29234y;
            Objects.requireNonNull(timePickerView);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.timepicker.TimePickerView$b */
    public class C5989b implements MaterialButtonToggleGroup.InterfaceC5936e {
        public C5989b() {
        }

        @Override // com.google.android.material.button.MaterialButtonToggleGroup.InterfaceC5936e
        /* JADX INFO: renamed from: a */
        public void mo12767a(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
            TimePickerView timePickerView = TimePickerView.this;
            int i2 = TimePickerView.f29234y;
            Objects.requireNonNull(timePickerView);
        }
    }

    public TimePickerView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: k */
    public final void m12894k() {
        if (this.f29236B.getVisibility() == 0) {
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.m15851b(this);
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            char c2 = getLayoutDirection() == 0 ? (char) 2 : (char) 1;
            if (constraintSet.f37049e.containsKey(Integer.valueOf(R.id.material_clock_display))) {
                ConstraintSet.a aVar = constraintSet.f37049e.get(Integer.valueOf(R.id.material_clock_display));
                switch (c2) {
                    case 1:
                        ConstraintSet.b bVar = aVar.f37053d;
                        bVar.f37100j = -1;
                        bVar.f37098i = -1;
                        bVar.f37061E = -1;
                        bVar.f37067K = -1;
                        break;
                    case 2:
                        ConstraintSet.b bVar2 = aVar.f37053d;
                        bVar2.f37104l = -1;
                        bVar2.f37102k = -1;
                        bVar2.f37062F = -1;
                        bVar2.f37069M = -1;
                        break;
                    case 3:
                        ConstraintSet.b bVar3 = aVar.f37053d;
                        bVar3.f37106n = -1;
                        bVar3.f37105m = -1;
                        bVar3.f37063G = -1;
                        bVar3.f37068L = -1;
                        break;
                    case 4:
                        ConstraintSet.b bVar4 = aVar.f37053d;
                        bVar4.f37107o = -1;
                        bVar4.f37108p = -1;
                        bVar4.f37064H = -1;
                        bVar4.f37070N = -1;
                        break;
                    case 5:
                        aVar.f37053d.f37109q = -1;
                        break;
                    case 6:
                        ConstraintSet.b bVar5 = aVar.f37053d;
                        bVar5.f37110r = -1;
                        bVar5.f37111s = -1;
                        bVar5.f37066J = -1;
                        bVar5.f37072P = -1;
                        break;
                    case 7:
                        ConstraintSet.b bVar6 = aVar.f37053d;
                        bVar6.f37112t = -1;
                        bVar6.f37113u = -1;
                        bVar6.f37065I = -1;
                        bVar6.f37071O = -1;
                        break;
                    default:
                        throw new IllegalArgumentException("unknown constraint");
                }
            }
            constraintSet.m15850a(this, true);
            setConstraintSet(null);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m12894k();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            m12894k();
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ViewOnClickListenerC5988a viewOnClickListenerC5988a = new ViewOnClickListenerC5988a();
        this.f29237C = viewOnClickListenerC5988a;
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        this.f29236B = materialButtonToggleGroup;
        materialButtonToggleGroup.f28896j.add(new C5989b());
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        this.f29238z = chip;
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        this.f29235A = chip2;
        TimePickerView3 timePickerView3 = new TimePickerView3(this, new GestureDetector(getContext(), new TimePickerView2(this)));
        chip.setOnTouchListener(timePickerView3);
        chip2.setOnTouchListener(timePickerView3);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(viewOnClickListenerC5988a);
        chip2.setOnClickListener(viewOnClickListenerC5988a);
    }
}
