# Case Scope

## meta
- case_id: hakara-2.1.0-recovery
- created: 2026-11-20T21:20:06.4104483+07:00
- operator: local
- project_root: D:\revert
- primary_skill: apk-reverse/SKILL.md
- primary_id: R1
- lead_role: lead
- specialist_roles: []
- hint: offline APK source recovery karaoke voice recorder
- preset: offline-sample

## auth
- status: granted
- basis: own_system
- evidence_of_auth: preset:offline-sample (owner-operated local file)
- MUST NOT proceed if status != granted

## in_scope
- assets:
  - D:\revert\Hakara+-+Sing+karaoke,+voice+recorder_2.1.0_APKPure.apk
- surfaces: []
- activities: []

## out_of_scope
- assets: []
- activities: [dos, phishing_real_users, unrestricted_exfil]

## network_profile
- mode: offline
- notes: |
    offline | lab_only | authorized_target_only | unrestricted_lab
    Change mode only after auth.status = granted.

## deliverables
- report: true
- field_journal: true
- diagrams: true
- timeline: true

## constraints
- timebox: {}
- stealth: low
- data_handling: anonymize

## signoff
- ready_for_act: true
- checklist:
  - [x] auth.status = granted
  - [x] in_scope.assets non-empty OR offline sample path set
  - [x] network_profile.mode chosen
  - [ ] out_of_scope reviewed
  - [ ] roles assigned (see skills/ops/role-map.md)

## ops_refs
- skills/ops/scope-contract.md
- skills/ops/evidence-finding-path.md
- skills/ops/role-map.md
- skills/ops/timeline-workitem.md
- skills/ops/IDENTITY.md