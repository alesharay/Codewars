def abbrev_name(name):
  names = name.split(" ")
  print(f'names: {names}')
  initials = ""
  for word in names:
    if word == names[-1]:
      initials += word[0]
    else:
      initials += f'{word[0]}.'
  return initials.upper()


def abbrevName(name):
    return '.'.join(w[0] for w in name.split()).upper()